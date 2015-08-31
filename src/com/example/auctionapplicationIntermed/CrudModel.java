package com.example.auctionapplicationIntermed;

public class CrudModel {
	public static enum Command{
		ADD, DELETE, BID, UPDATE
	}
	private Command command;
	private String args;
	
	public CrudModel(Command cmd, String str){
		this.command = command;
		this.args = str;
	}
	
	public Command getCommand(){
		return this.command;
	}
	public String getArgs(){
		return args;
	}
	
}
