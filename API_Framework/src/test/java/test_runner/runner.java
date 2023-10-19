package test_runner;

import java.io.IOException;

import TestScripts.TC1_postrequest;
import TestScripts.TC2_getall;
import TestScripts.TC3_getpart;
import TestScripts.TC4_putrequest;
import TestScripts.TC5_Delrequest;

public class runner 
{
public static void main(String[] args) throws IOException
{
	TC1_postrequest tp= new TC1_postrequest();
	tp.tc_post();
	TC2_getall tg= new TC2_getall();
	tg.tc_getall();
	TC3_getpart tgp= new TC3_getpart();
	tgp.getpart();
	TC4_putrequest pt=new TC4_putrequest();
	pt.putrequest();
	TC5_Delrequest del=new TC5_Delrequest();
	del.delete();
}
}
