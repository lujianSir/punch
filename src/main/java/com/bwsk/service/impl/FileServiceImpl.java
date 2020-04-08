package com.bwsk.service.impl;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bwsk.entity.FileInfo;
import com.bwsk.mapper.IFileMapper;
import com.bwsk.service.IFileService;
import com.bwsk.util.Result;
import com.bwsk.util.TimeUtils;

@Service
public class FileServiceImpl implements IFileService {

	@Autowired
	private IFileMapper fileMapper;

	@Override
	public String fileUpload(MultipartFile file) {
		// TODO Auto-generated method stub
		if (!file.isEmpty()) {
			try {
				// 文件1存放服务端的位置
				File dir = null;
				long now = System.currentTimeMillis();
				String filesuffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
				String filename = now + filesuffix;
				String newrootPath = System.getProperty("user.dir") + "/upload";
				System.out.println(newrootPath);
				dir = new File(newrootPath + File.separator + "file" + File.separator);
				if (!dir.exists()) {
					dir.mkdirs();
				}

				String filePath = dir.getAbsolutePath() + File.separator + filename;

				// 写文件到服务器
				File serverFile = new File(filePath);
				file.transferTo(serverFile);

				// 录入文件信息
				FileInfo fileinfo = new FileInfo();
				fileinfo.setFname(filename);
				fileinfo.setFrealurl(filePath);
				String fvirtualurl = "";
				fvirtualurl = "/file/" + filename;
				fileinfo.setFvirtualurl(fvirtualurl);
				fileinfo.setFuploadtime(TimeUtils.getCurrent());
				fileMapper.insertFileInfo(fileinfo);
				return fvirtualurl;
			} catch (Exception e) {
				return "服务端错误";
			}
		} else {
			return "请上传文件";
		}
	}

	@Override
	public Result<?> fileinfoDelete(String fvirtualurl) {
		// TODO Auto-generated method stub
		try {
			FileInfo fileinfo = new FileInfo();
			// 根据名称查询数据,获取文件路径
			fileinfo = fileMapper.queryFileInfoByName(fvirtualurl);
			// 删除文件
			File file = new File(fileinfo.getFrealurl());
			if (file.exists()) {
				file.delete();
			}
			// 删除记录
			fileMapper.deleteFileInfoById(fileinfo.getFid());
			return Result.success();
		} catch (Exception e) {
			return Result.error(500, "服务端错误");
		}
	}

}
