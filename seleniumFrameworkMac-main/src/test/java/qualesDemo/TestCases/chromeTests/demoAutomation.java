package qualesDemo.TestCases.chromeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import qualesDemo.DriverFactory.chrome;

import java.util.concurrent.TimeUnit;


public class demoAutomation {
    public WebDriver driver;
    public String baseURL = "https://www.facebook.com";


    @Test
    public void login() throws InterruptedException {
        //Open Browser

        System.out.println("Opening chrome browser");

        //Choose Chrome
        driver = chrome.open();

        driver.manage().window().maximize();

        //Opening Facebook URL
        driver.get(baseURL);

        //Enter username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("08094199966");

        //Enter Password
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("quales123");

        //Click on login
        driver.findElement(By.name("login")).click();

        //Waiting time
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Open Profile
        driver.findElement(By.xpath("//span[contains(text(),'Quales Demo')]")).click();

        //Scroll
        JavascriptExecutor jse = ((JavascriptExecutor) driver);
        jse.executeScript("window.scrollBy(0,700)");
        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//span[contains(text(),\"What's on your mind?\")]")).click();

        driver.findElement(By.cssSelector("body._6s5d._71pn._-kb.segoe:nth-child(2) div.rq0escxv.l9j0dhe7.du4w35lb div.__fb-light-mode.l9j0dhe7.tkr6xdv7 div.rq0escxv.l9j0dhe7.du4w35lb:nth-child(1) div.j83agx80.cbu4d94t.h3gjbzrl.l9j0dhe7 div.iqfcb0g7.tojvnm2t.a6sixzi8.k5wvi7nf.q3lfd5jv.pk4s997a.bipmatt0.cebpdrjk.qowsmv63.owwhemhu.dp1hu0rb.dhp61c6y.l9j0dhe7.iyyx5f41.a8s20v7p:nth-child(2) div.gs1a9yip.rq0escxv.j83agx80.cbu4d94t.kb5gq1qc.taijpn5t.h3gjbzrl div.ll8tlv6m.j83agx80.taijpn5t.pnzxbu4t.hpfvmrgz.hzruof5a.dflh9lhu.scb9dxdr.guvg9d06.is38vakr.f59ohtjy.aw1xchsf.k9xwq5rp.fyttoq6t div.cjfnh4rs.l9j0dhe7.du4w35lb.j83agx80.cbu4d94t.lzcic4wl.ni8dbmo4.stjgntxs.oqq733wu.cwj9ozl2.io0zqebd.m5lcvass.fbipl8qg.nwvqtn77.nwpbqux9.iy3k6uwz.e9a99x49.g8p4j16d.bv25afu3.d2edcug0 div.idiwt2bm.lzcic4wl.ni8dbmo4.stjgntxs.l9j0dhe7.dbpd2lw6:nth-child(1) div.rq0escxv.pmk7jnqg.du4w35lb.pedkr2u6.oqq733wu.ms05siws.pnx7fd3z.b7h9ocf4.j9ispegn.kr520xx4:nth-child(1) div.k4urcfbm.l9j0dhe7.datstx6m.rq0escxv div.j83agx80.btwxx1t3 div.j83agx80.cbu4d94t.f0kvp8a6.mfofr4af.l9j0dhe7.ij1vhnid.smbo3krw.oh7imozk div.q5bimw55.rpm2j7zs.k7i0oixp.gvuykj2m.j83agx80.cbu4d94t.ni8dbmo4.eg9m0zos.l9j0dhe7.du4w35lb.ofs802cu.pohlnb88.dkue75c7.mb9wzai9.l56l04vs.r57mb794.kh7kg01d.c3g1iek1.buofh1pr:nth-child(2) div.j83agx80.cbu4d94t.buofh1pr.l9j0dhe7 div.o6r2urh6.buofh1pr.datstx6m.l9j0dhe7.oh7imozk.x68sjeil div.rq0escxv.buofh1pr.df2bnetk.hv4rvrfc.dati1w0a.l9j0dhe7.k4urcfbm.du4w35lb.gbhij3x4:nth-child(1) div.taijpn5t.j83agx80 div.gcieejh5.bn081pho.humdl8nn.izx4hr6d.rq0escxv.oo9gr5id.t5a262vz.o0t2es00.b1v8xokw.datstx6m.f530mmz5.lzcic4wl.ecm0bbzt.rz4wbd8a.sj5x9vvc.a8nywdso.k4urcfbm.o8yuz56k div.rq0escxv.datstx6m.k4urcfbm.a8c37x1j div._5rp7 div._5rpb div.notranslate._5rpu div:nth-child(1) div:nth-child(1) > div._1mf._1mj"))
                .sendKeys("Test");

        driver.findElement(By.cssSelector("body._6s5d._71pn._-kb.segoe:nth-child(2) div.rq0escxv.l9j0dhe7.du4w35lb div.__fb-light-mode.l9j0dhe7.tkr6xdv7 div.rq0escxv.l9j0dhe7.du4w35lb:nth-child(1) div.j83agx80.cbu4d94t.h3gjbzrl.l9j0dhe7 div.iqfcb0g7.tojvnm2t.a6sixzi8.k5wvi7nf.q3lfd5jv.pk4s997a.bipmatt0.cebpdrjk.qowsmv63.owwhemhu.dp1hu0rb.dhp61c6y.l9j0dhe7.iyyx5f41.a8s20v7p:nth-child(2) div.gs1a9yip.rq0escxv.j83agx80.cbu4d94t.kb5gq1qc.taijpn5t.h3gjbzrl div.ll8tlv6m.j83agx80.taijpn5t.pnzxbu4t.hpfvmrgz.hzruof5a.dflh9lhu.scb9dxdr.guvg9d06.is38vakr.f59ohtjy.aw1xchsf.k9xwq5rp.fyttoq6t div.cjfnh4rs.l9j0dhe7.du4w35lb.j83agx80.cbu4d94t.lzcic4wl.ni8dbmo4.stjgntxs.oqq733wu.cwj9ozl2.io0zqebd.m5lcvass.fbipl8qg.nwvqtn77.nwpbqux9.iy3k6uwz.e9a99x49.g8p4j16d.bv25afu3.d2edcug0 div.idiwt2bm.lzcic4wl.ni8dbmo4.stjgntxs.l9j0dhe7.dbpd2lw6:nth-child(1) div.rq0escxv.pmk7jnqg.du4w35lb.pedkr2u6.oqq733wu.ms05siws.pnx7fd3z.b7h9ocf4.j9ispegn.kr520xx4:nth-child(1) div.k4urcfbm.l9j0dhe7.datstx6m.rq0escxv div.j83agx80.btwxx1t3 div.j83agx80.cbu4d94t.f0kvp8a6.mfofr4af.l9j0dhe7.ij1vhnid.smbo3krw.oh7imozk div.ihqw7lf3.discj3wi.l9j0dhe7:nth-child(3) div.bp9cbjyn.rq0escxv.j83agx80.i1fnvgqd.hv4rvrfc.dati1w0a.discj3wi.k4urcfbm div.oajrlxb2.g5ia77u1.qu0x051f.esr5mh6w.e9989ue4.r7d6kgcz.rq0escxv.nhd2j8a9.pq6dq46d.p7hjln8o.kvgmc6g5.cxmmr5t8.oygrvhab.hcukyx3x.jb3vyjys.rz4wbd8a.qt6c0cv9.a8nywdso.i1ao9s8h.esuyzwwr.f1sip0of.lzcic4wl.l9j0dhe7.abiwlrkh.p8dawk7l.cbu4d94t.taijpn5t.k4urcfbm > div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.pfnyh3mw.taijpn5t.bp9cbjyn.owycx6da.btwxx1t3.kt9q3ron.ak7q8e6j.isp2s0ed.ri5dt5u2.rt8b4zig.n8ej3o3l.agehan2d.sk4xxmp2.d1544ag0.tw6a2znq.s1i5eluu.tv7at329"))
                .click();

    }


    }


