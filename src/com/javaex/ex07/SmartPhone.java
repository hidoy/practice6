package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
	
	@Override
    public void execute(String str){
        if("앱".equals(str)) {
        	playApp();
        } 
        else {
        	super.execute(str);
        }
        
        
    }
 
    public void playApp() {
    	System.out.println("앱 실행");
    }
     @Override
    public void playMusic() {
    	System.out.println("다운로드해서 음악재생");
    }
    
    
    
}
