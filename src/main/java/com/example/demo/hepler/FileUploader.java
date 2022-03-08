package com.example.demo.hepler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploader {

	public final String uploadDir="F:\\shopmarket\\Rest\\src\\main\\resources\\static\\Image";
	
	
	
	public Boolean uploadFile(MultipartFile file)
	{
		boolean f=false;
		try {
			
//			InputStream inputStream=file.getInputStream();
//			
//			byte data[]=new byte[inputStream.available()];
//			inputStream.read(data);
//			
//			FileOutputStream fileOutputStream=new FileOutputStream(uploadDir+File.separator+file.getOriginalFilename());
//			
//			fileOutputStream.write(data);
//			fileOutputStream.flush();
//			fileOutputStream.close();
//			
//			f=true;
			
			
			Files.copy(file.getInputStream(),Paths.get(uploadDir+File.separator+file.getOriginalFilename()) , StandardCopyOption.REPLACE_EXISTING);
			
			f=true;
			
			return f;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		
		return f;
		
	}
	
	
}
