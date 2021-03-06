package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.User;
import business.OrdersBusinessInterface;

@ManagedBean 
@ViewScoped
public class FormController {
	
	@Inject
	OrdersBusinessInterface service;

	public String onSubmit(User user)//submit user's name using the Submit Button
	{
		System.out.println("To check: The user's first name is: " + user.getFirstName() + " and their last name is: " + user.getLastName());
		FacesContext context = FacesContext.getCurrentInstance();
		user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		service.test();
		return "TestResponse.xhtml";
	}
	public String onFlash(User user)//flshg user's name using the Flash Button
	{
		FacesContext context = FacesContext.getCurrentInstance();
		user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		service.test();
		return "TestResponse2.xhtml";
	}
}
