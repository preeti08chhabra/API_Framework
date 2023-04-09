package test_runner;

import java.io.IOException;

import TestScripts.TC1_postrequest;
import TestScripts.TC2_getall;

public class runner 
{
	
public static void main(String[] args) throws IOException

{
	TC1_postrequest tp= new TC1_postrequest();
	tp.tc_post();
	TC2_getall tg= new TC2_getall();
	tg.tc_getall();
}

}
