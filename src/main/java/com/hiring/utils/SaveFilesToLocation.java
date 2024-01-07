package com.hiring.utils;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class SaveFilesToLocation {

	@Value("${file.upload.path}")
	private String uploadDir;

	public String storeResume(MultipartFile file, Long userId) {
		try {

			String fileName = userId + "_" + file.getOriginalFilename();

			File directory = new File(uploadDir);
			if (!directory.exists()) {
				directory.mkdirs();
			}

			file.transferTo(new File(uploadDir +  fileName));
			return uploadDir  + fileName;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}