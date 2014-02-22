/*******************************************************************************
 *        File: Projects.java
 *      Author: Morteza Ansarinia <ansarinia@me.com>
 *  Created on: Feb 22, 2014
 *     Project: ratnic.tracker
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/
package controllers;

import models.Project;
import play.data.Form;
import play.mvc.*;

public class Projects extends Controller {

	Form<Project> projectForm = Form.form(Project.class);
	
    public static Result index() {
    	return list(0, "name", "asc", "");
    }
    
    /**
     * List all projects that current user have access to.
     * @param page Current page number (starts from 0)
     * @param sortBy Column to be sorted
     * @param order Sort order (either asc or desc)
     * @param filter Filter applied on computer names
     */
    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
            views.html.projects.list.render(
                Project.page(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }

    /**
     * Show project page.
     * @param project
     * @return
     */
    public static Result show(Project project) {
    	return TODO;
    }


    public static Result create() {
    	return TODO;
    }

    public static Result save() {
    	return TODO;
    }

    public static Result update(Long id) {
    	return TODO;
    }

    public static Result edit(Long id) {
    	return TODO;
    }
    
    public static Result delete(Long id) {
    	return TODO;
    }

    /**
     * Manage project milestones
     * @param project
     * @return
     */
    public static Result milestones(Project project) {
    	return TODO;
    }
    
    public static Result help() {
    	return TODO;
    }
}
