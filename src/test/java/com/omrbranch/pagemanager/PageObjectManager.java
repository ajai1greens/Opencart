package com.omrbranch.pagemanager;

import com.omrbranch.pages.EditPojo;
import com.omrbranch.pages.HomePagePojo;
import com.omrbranch.pages.LoginPojo;
import com.omrbranch.pages.LoginRegisterPojo;
import com.omrbranch.pages.PeronsalAddressPojo;
import com.omrbranch.pages.ShippingPojo;

public class PageObjectManager {

	private LoginPojo login;
	private LoginRegisterPojo loginreg;
	private HomePagePojo homepge;
	private PeronsalAddressPojo addresspge;
	private ShippingPojo shippge;
	private EditPojo editpge;

	public LoginPojo loginpage() {
		return (login == null) ? login = new LoginPojo() : login;
	}

	public LoginRegisterPojo loginregpage() {
		return (loginreg == null) ? loginreg = new LoginRegisterPojo() : loginreg;
	}

	public HomePagePojo homepage() {
		return (homepge == null) ? homepge = new HomePagePojo() : homepge;
	}

	public PeronsalAddressPojo addresspage() {
		return (addresspge == null) ? addresspge = new PeronsalAddressPojo() : addresspge;
	}

	public ShippingPojo shipPage() {
		return (shippge == null) ? shippge = new ShippingPojo() : shippge;
	}

	public EditPojo editPage() {
		return (editpge == null) ? editpge = new EditPojo() : editpge;
	}

}
