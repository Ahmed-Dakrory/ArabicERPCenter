package main.com.crm.helpers.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.inject.Named;

import main.com.crm.work_field.work_field;
import main.com.crm.work_field.work_fieldAppServiceImpl;

@Named
@FacesConverter(value = "workFieldConverter")
public class workFieldConverter implements Converter {

	@Inject
	private work_fieldAppServiceImpl work_fieldDataFacede; 
	
     
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

    	System.out.println("Ahmed1: "+String.valueOf(value));
        if(value != null && value.trim().length() > 0) {
            try {
            	work_field wF=work_fieldDataFacede.getByField(value);
            	System.out.println("Ahmed5: "+String.valueOf(wF.getField()));
                return wF;
            } catch(NumberFormatException e) {

            	System.out.println("Ahmed2: "+String.valueOf(value));
                return null;
            }
        }
        else {
            return null;
        }
    }
 
    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if(object != null) {
        	work_field field = ((work_field) object);
        	if(field.getId()!=null) {
        		return String.valueOf(field.getField());
        	}
        	return null;
            
        }
        else {
            return null;
        }
    }   
}
