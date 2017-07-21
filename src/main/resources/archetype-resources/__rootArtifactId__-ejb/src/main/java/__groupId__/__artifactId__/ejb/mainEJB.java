package ${groupId}.${artifactId}.ejb;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.PostActivate;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlSelectOneListbox;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import javax.persistence.PostLoad;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.servlet.http.Part;

import ${groupId}.${artifactId}.model.dao.DAOException;
import ${groupId}.${artifactId}.model.dao.User_dao;
import import ${groupId}.${artifactId}.model.entities.User_entity;

/**
 * - Enregistre les nouvelles database en BD - Liste les database existantes
 * 
 * @author mistifiou
 *
 */

@ManagedBean(name = "mainEJB")
@ViewScoped
public class mainEJB implements Serializable {
	private static final long serialVersionUID = 1L; //TODO : change version UID

	private string example = "hello ${artifactId}";
	
	
	@EJB
	private DAO_User user_dao;
		

	public string sayHello(){
		return this.example;
	}
	

	////////////////////
	//// PRIVATE
	/////////////////////

	@PostConstruct
	private void post_constructor() {
		System.out.println("----------------- POST CONSTRUCT CALLED -------------------");
	}

	@PostActivate
	private void activation() {
		System.out.println("ACTIVATE CALLED");
	}

	@PostLoad
	private void loading() {
		System.out.println("LOAD CALLED");
	}

	@PostRemove
	private void Remove() {
		System.out.println("Remove CALLED");
	}

	@PostUpdate
	private void listen() {
		System.out.println("UPDATE CALLED");
	}
}
