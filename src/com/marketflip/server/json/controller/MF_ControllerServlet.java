package com.marketflip.server.json.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MF_ControllerServlet extends HttpServlet {

	/**
	 * Processes all incoming GET requests.
	 * 
	 * @param HttpServletRequest
	 *            req - The http request.
	 * @param HttpServletResponse
	 *            resp - The response from the servlet.
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		processRequest(req, resp);
	}

	/**
	 * Processes all incoming POST requests.
	 * 
	 * @param HttpServletRequest
	 *            req - The http request.
	 * @param HttpServletResponse
	 *            resp - The response from the servlet.
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		processRequest(req, resp);
	}

	/**
	 * Primary function to process all requests. The first filter.
	 * 
	 * @param HttpServletRequest
	 *            req - The http request.
	 * @param HttpServletResponse
	 *            resp - The response from the servlet.
	 */
	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String request;
		request = req.getParameter("upc").toString();

		PrintWriter JSONwriter = resp.getWriter();
		resp.setContentType("text/plain");
		JSONwriter.print("Hello " + request + ", MarketFlip is alive!");
	}
}
