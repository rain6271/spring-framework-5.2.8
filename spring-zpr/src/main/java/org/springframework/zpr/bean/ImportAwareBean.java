package org.springframework.zpr.bean;


import org.springframework.context.annotation.ImportAware;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

@Component
public class ImportAwareBean implements ImportAware {


	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {

		MergedAnnotations annotations = importMetadata.getAnnotations();
		System.out.println(annotations);
	}
}
