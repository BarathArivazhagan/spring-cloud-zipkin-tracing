package com.barath.app.logger;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.helpers.SubstituteLoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;

public final class AMCLoggerFactory implements AMCLogger{
	
    
	
	private static AMCLoggerFactory AMC_Logger_Factory=null;
	
	private AMCLoggerFactory(){
		
	}
	
	protected static AMCLoggerFactory getInstance(){
		
		if(AMC_Logger_Factory == null ){
			AMC_Logger_Factory =new AMCLoggerFactory();
		}
		return AMC_Logger_Factory;
	}
	
	
	
	public static AMCLogger getLogger() {
		
        return AMCLoggerFactory.getInstance();
	}
	
	protected static Logger getLoggerFromFactory(){
		return LoggerFactory.getLogger(getLoggerName());
	}
	 
	 
	 protected static String getLoggerName(){
		 StackTraceElement[] traces=Thread.currentThread().getStackTrace();
		 return traces[4].getClassName();
		 
	 }
	 
	 
	 protected static AMCLoggerFactory getILoggerFactory() {
		 return getInstance();
	 }

	@Override
	public String getName() {
		
		return AMCLoggerFactory.class.getName();
	}

	@Override
	public boolean isTraceEnabled() {
		return getLoggerFromFactory().isInfoEnabled();
	}

	@Override
	public void trace(String msg) {
		getLoggerFromFactory().trace(msg);
	}

	@Override
	public void trace(String format, Object arg) {
		getLoggerFromFactory().trace(format, arg);
		
	}

	@Override
	public void trace(String format, Object arg1, Object arg2) {
		getLoggerFromFactory().trace(format, arg1, arg2);

		
	}

	@Override
	public void trace(String format, Object... arguments) {
		getLoggerFromFactory().trace(format, arguments);

		
	}

	@Override
	public void trace(String msg, Throwable t) {
		getLoggerFromFactory().trace(msg, t);

		
	}

	@Override
	public boolean isTraceEnabled(Marker marker) {
		return getLoggerFromFactory().isTraceEnabled(marker);

	}

	@Override
	public void trace(Marker marker, String msg) {
		getLoggerFromFactory().trace(marker, msg);

		
	}

	@Override
	public void trace(Marker marker, String format, Object arg) {
		getLoggerFromFactory().trace(marker,format,arg);

		
	}

	@Override
	public void trace(Marker marker, String format, Object arg1, Object arg2) {
		getLoggerFromFactory().trace(format, arg1, arg2);

		
	}

	@Override
	public void trace(Marker marker, String format, Object... argArray) {
		getLoggerFromFactory().trace(marker ,format, argArray);

		
	}

	@Override
	public void trace(Marker marker, String msg, Throwable t) {
		getLoggerFromFactory().trace(marker,msg, t);

		
	}

	@Override
	public boolean isDebugEnabled() {
		return getLoggerFromFactory().isDebugEnabled();

	}

	@Override
	public void debug(String msg) {
		getLoggerFromFactory().debug(msg);

		
	}

	@Override
	public void debug(String format, Object arg) {
		getLoggerFromFactory().debug(format, arg);

		
	}

	@Override
	public void debug(String format, Object arg1, Object arg2) {
		getLoggerFromFactory().debug(format, arg1, arg2);

		
	}

	@Override
	public void debug(String format, Object... arguments) {
		getLoggerFromFactory().debug(format, arguments);

		
	}

	@Override
	public void debug(String msg, Throwable t) {
		getLoggerFromFactory().debug(msg, t);

		
	}

	@Override
	public boolean isDebugEnabled(Marker marker) {
		return getLoggerFromFactory().isDebugEnabled(marker);

		
	}

	@Override
	public void debug(Marker marker, String msg) {
		getLoggerFromFactory().debug(marker, msg);

		
	}

	@Override
	public void debug(Marker marker, String format, Object arg) {
		getLoggerFromFactory().debug(marker, format, arg);;

		
	}

	@Override
	public void debug(Marker marker, String format, Object arg1, Object arg2) {
		getLoggerFromFactory().debug(marker ,format, arg1, arg2);

		
	}

	@Override
	public void debug(Marker marker, String format, Object... arguments) {
		getLoggerFromFactory().debug(marker, format, arguments);

		
	}

	@Override
	public void debug(Marker marker, String msg, Throwable t) {
		getLoggerFromFactory().debug(marker, msg, t);

		
	}

	@Override
	public boolean isInfoEnabled() {
		return	getLoggerFromFactory().isInfoEnabled();

		 
	}

	@Override
	public void info(String msg) {
		getLoggerFromFactory().info(msg);

		
	}

	@Override
	public void info(String format, Object arg) {
		getLoggerFromFactory().info(format, arg);

		
	}

	@Override
	public void info(String format, Object arg1, Object arg2) {
		getLoggerFromFactory().info(format, arg1, arg2);

		
	}

	@Override
	public void info(String format, Object... arguments) {
		getLoggerFromFactory().info(format, arguments);

		
	}

	@Override
	public void info(String msg, Throwable t) {
		getLoggerFromFactory().info(msg, t);

		
	}

	@Override
	public boolean isInfoEnabled(Marker marker) {
		return getLoggerFromFactory().isInfoEnabled(marker);

	}

	@Override
	public void info(Marker marker, String msg) {
		getLoggerFromFactory().info(marker, msg);

		
	}

	@Override
	public void info(Marker marker, String format, Object arg) {
		getLoggerFromFactory().info(marker, format, arg);

		
	}

	@Override
	public void info(Marker marker, String format, Object arg1, Object arg2) {
		getLoggerFromFactory().info(marker, format, arg1, arg2);

		
	}

	@Override
	public void info(Marker marker, String format, Object... arguments) {
		getLoggerFromFactory().info(marker, format, arguments);

		
	}

	@Override
	public void info(Marker marker, String msg, Throwable t) {
		getLoggerFromFactory().info(marker, msg, t);

		
	}

	@Override
	public boolean isWarnEnabled() {
		return getLoggerFromFactory().isWarnEnabled();

		 
	}

	@Override
	public void warn(String msg) {
		getLoggerFromFactory().warn(msg);

		
	}

	@Override
	public void warn(String format, Object arg) {
		getLoggerFromFactory().warn(format, arg);

		
	}

	@Override
	public void warn(String format, Object... arguments) {
		getLoggerFromFactory().warn(format, arguments);

		
	}

	@Override
	public void warn(String format, Object arg1, Object arg2) {
		getLoggerFromFactory().warn(format, arg1, arg2);

		
	}

	@Override
	public void warn(String msg, Throwable t) {
		getLoggerFromFactory().warn(msg, t);

		
	}

	@Override
	public boolean isWarnEnabled(Marker marker) {
		return getLoggerFromFactory().isWarnEnabled(marker);

		
	}

	@Override
	public void warn(Marker marker, String msg) {
		getLoggerFromFactory().warn(marker, msg);

		
	}

	@Override
	public void warn(Marker marker, String format, Object arg) {
		getLoggerFromFactory().warn(marker, format, arg);

		
	}

	@Override
	public void warn(Marker marker, String format, Object arg1, Object arg2) {
		getLoggerFromFactory().warn(marker, format, arg1, arg2);

		
	}

	@Override
	public void warn(Marker marker, String format, Object... arguments) {
		getLoggerFromFactory().warn(marker, format, arguments);

		
	}

	@Override
	public void warn(Marker marker, String msg, Throwable t) {
		getLoggerFromFactory().warn(marker, msg, t);

		
	}

	@Override
	public boolean isErrorEnabled() {
		return getLoggerFromFactory().isErrorEnabled();

		
	}

	@Override
	public void error(String msg) {
		getLoggerFromFactory().error(msg);

		
	}

	@Override
	public void error(String format, Object arg) {
		getLoggerFromFactory().error(format, arg);

		
	}

	@Override
	public void error(String format, Object arg1, Object arg2) {
		getLoggerFromFactory().error(format, arg1, arg2);

		
	}

	@Override
	public void error(String format, Object... arguments) {
		getLoggerFromFactory().error(format, arguments);

		
	}

	@Override
	public void error(String msg, Throwable t) {
		getLoggerFromFactory().error(msg, t);

		
	}

	@Override
	public boolean isErrorEnabled(Marker marker) {
		return getLoggerFromFactory().isErrorEnabled(marker);

		
	}

	@Override
	public void error(Marker marker, String msg) {
		getLoggerFromFactory().error(marker,msg);

		
	}

	@Override
	public void error(Marker marker, String format, Object arg) {
		getLoggerFromFactory().error(marker, format, arg);

		
	}

	@Override
	public void error(Marker marker, String format, Object arg1, Object arg2) {
		getLoggerFromFactory().error(format, arg1, arg2);

		
	}

	@Override
	public void error(Marker marker, String format, Object... arguments) {
		getLoggerFromFactory().error(format, arguments);

		
	}

	@Override
	public void error(Marker marker, String msg, Throwable t) {
		getLoggerFromFactory().error(marker, msg, t);

		
	}
	  
	   

	  
	
	

}
