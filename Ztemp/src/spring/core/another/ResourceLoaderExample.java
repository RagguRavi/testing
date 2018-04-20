package spring.core.another;

import java.io.File;
import java.io.IOException;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class ResourceLoaderExample implements ResourceLoaderAware{

	ResourceLoader resourceloader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		// TODO Auto-generated method stub
		this.resourceloader=resourceLoader;
	}
	
	
	void loadFile(String path) {
		Resource resource=resourceloader.getResource("file:"+path);
		
		try {
		File file = resource.getFile();
		System.out.println(file+"\t"+file.exists());
		System.out.println(file.getTotalSpace()+"\t"+file.getName()+"\t"+file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
