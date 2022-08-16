package com.stipulate.SiteMeshFilter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.sitemesh.content.tagrules.html.DivExtractingTagRuleBundle;
import org.sitemesh.content.tagrules.html.Sm2TagRuleBundle;
public class MySitemeshFilter extends ConfigurableSiteMeshFilter {

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
	// Assigning default decorator if no path specific decorator found
	
	try {
		builder.addDecoratorPath("/register","/decorators/Navbar").create();
		// Map decorators to specific path patterns.
		// Exclude few paths from decoration.
//		.addExcludedPath("/javadoc/*")
//		.addExcludedPath("/brochures/*");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	  builder.addTagRuleBundle(new Sm2TagRuleBundle());
	}
	
}
