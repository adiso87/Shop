package com.jelastic.adiso87.Shop.languages;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("language")
@Scope("session")
public class Languages implements Serializable {

	private static final long serialVersionUID = 1L;
	private String localeCode;

	private static Map<String,Object> countries;
	static{
		countries = new LinkedHashMap<String, Object>();
		countries.put("Polski", new Locale("pl"));
		countries.put("English", new Locale("en"));
	}

	public Map<String,Object> getCountriesInMap(){
		return countries;
	}
	public String getLocaleCode() {
		return localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}
	
	public void onLocaleChange(ValueChangeEvent e){
		String newLocaleValue = e.getNewValue().toString();
		System.out.println(newLocaleValue);
		//loop through country map to compare local codess
		for(Map.Entry<String, Object>entry : countries.entrySet()){
			if(entry.getValue().toString().equals(newLocaleValue)){
				FacesContext.getCurrentInstance()
					.getViewRoot().setLocale((Locale)entry.getValue());
			}
		}
		
		
		
	}

}
