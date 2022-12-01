package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.layout.element.Link;


public class GenerateResume {
    //PersonalInfo
    public static String FirstName,LastName,Email,Phone,LinkedIn, Template="1";

    //Education
    public static String Institute,PassYear,Grade,Course;

    //Project
    public static String ProjectTitle1,TechStack1,Functionality1,ProjDes1,ProjectTitle2,TechStack2,Functionality2,ProjDes2;

    //Skills
    public static String LangKnown,ProLangKnown,Others;

    //Achievement
    public static String Ach1,AchDate1,AchDes1,Ach2,AchDate2,AchDes2,Ach3,AchDate3,AchDes3;

    //WorkExp
    public static String Comp1,Design1,JoinDate1,EndDate1,Comp2,Design2,JoinDate2,EndDate2;

    //Files
    public static String destination;

    public static String HTML = "<html>\r\n" +
            "<head></head>\r\n" +
            "<body style=\"font-family: 'Poppins', sans-serif;\">\r\n" +
            "\r\n" +
            "<h1 style=\"text-align: center; margin-bottom: 0px\"><strong>&nbsp;"+ FirstName + "</strong> "+ LastName+"</h1>\r\n" +
            "<hr>\r\n" +
            "<p></p>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px\"></p>\r\n" +
            "\r\n" +
            "\r\n" +
            "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #CD6060;\" data-darkreader-inline-color=\"\">Personal Information</span></strong></h2>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Email address</strong>&nbsp; &nbsp; &nbsp;  : " + Email + "</p>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Contact No.&nbsp;</strong> &nbsp; &nbsp; &nbsp; &nbsp;  : "+Phone+"</p>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Linkedin&nbsp&nbsp;</strong> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : "+ LinkedIn +"</p>\r\n" +
            "\r\n" +
            "\r\n" +
            "<p></p>\r\n" +
            "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #CD6060;\" data-darkreader-inline-color=\"\">Education</span></strong></h2>\r\n" +
            "<hr />\r\n" +
            "<ul>\r\n" +
            "<li><strong>"+Institute+"</strong>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px\">&nbsp; &nbsp;Course: "+Course+"<br />&nbsp; &nbsp;Passing Year: "+ PassYear+"<br />&nbsp; &nbsp;Grade: "+Grade+"</p>\r\n" +
            "</li>\r\n" +
            "</ul>\r\n" +
            "\r\n" +
            "\r\n" +
            "\r\n" +
            "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #CD6060;\">Skills</span></strong></h2>\r\n" +
            "<hr />\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Languages Known&nbsp; &nbsp; &nbsp;</strong> &nbsp; &nbsp; &nbsp; &nbsp; :&nbsp; "+LangKnown+"</p>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Programming Languages&nbsp;</strong> : "+ProLangKnown+"</p>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Other&nbsp; &nbsp;</strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : "+Others+"</p>\r\n" +
            "\r\n" +
            "\r\n" +
            "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #CD6060;\">Work Experience</span></strong></h2>\r\n" +
            "<hr />\r\n" +
            "<ul>\r\n" +
            "<li><strong>"+Comp1+"</strong>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080; background-color: #ffffff;\">"+JoinDate1+" - "+EndDate1+"</span><br />Worked as "+Design1+"</p><br>\r\n" +
            "</li>\r\n" +
            "<li><strong>"+Comp2+"</strong>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080; background-color: #ffffff;\">"+JoinDate2+" - "+EndDate2+"</span><br />Worked as "+Design2+"<br /></p>\r\n" +
            "</li>\r\n" +
            "</ul>\r\n" +
            "\r\n" +
            "\r\n" +
            "\r\n" +
            "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #CD6060;\">Notable Projects</span></strong></h2>\r\n" +
            "<hr />\r\n" +
            "<ul>\r\n" +
            "<li><strong>"+ProjectTitle1+"</strong>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px\">"+Functionality1+"</p>\r\n" +
            "<ul style=\"list-style-type: circle;\">\r\n" +
            "<li>Technology Used : "+TechStack1+"</li>\r\n" +
            "<li>Description : "+ProjDes1+"</li>\r\n" +
            "</ul>\r\n" +
            "</li>\r\n" +
            "</ul>\r\n" +
            "<ul>\r\n" +
            "<li><strong>"+ProjectTitle2+"</strong>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px\">"+Functionality2+"</p>\r\n" +
            "<ul style=\"list-style-type: circle;\">\r\n" +
            "<li>Technology Used : "+TechStack2+"</li>\r\n" +
            "<li>Description : "+ProjDes2+"</li>\r\n" +
            "</ul>\r\n" +
            "</li>\r\n" +
            "</ul>\r\n" +
            "\r\n" +
            "\r\n" +
            "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #CD6060;\">Achievements</span></strong></h2>\r\n" +
            "<hr />\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\">"+AchDate1+"&nbsp; &nbsp; &nbsp; &nbsp; <strong><span style=\"color: #000000;\">"+Ach1+"</span></strong></span></p>\r\n" +
            "<p style=\"padding-left: 60px;margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><span style=\"color: #000000;\">&nbsp;"+AchDes1+"</span></span></p>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><strong><span style=\"color: #000000;\"></span></strong></span></p>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\">"+AchDate2+"&nbsp; &nbsp; &nbsp; &nbsp; <strong><span style=\"color: #000000;\">"+Ach2+"</span></strong></span></p>\r\n" +
            "<p style=\"padding-left: 60px;margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #000000;\">&nbsp;"+AchDes2+"</span></span></p>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><strong><span style=\"color: #000000;\"></span></strong></span></p>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\">"+AchDate3+"&nbsp; &nbsp; &nbsp; &nbsp; <strong><span style=\"color: #000000;\">"+Ach3+"<br /></span></strong><span style=\"color: #000000;\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; "+AchDes3+"</span></span></p>\r\n" +
            "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><strong><span style=\"color: #000000;\"></span></strong></span></p>\r\n" +
            "\r\n" +
            "\r\n" +
            "</body>\r\n" +
            "</html>";



    public static void main( String[] args ) throws  IOException
    {
        if(Template=="1") {
            HTML = "<html>\r\n" +
                    "<head></head>\r\n" +
                    "<body style=\"font-family: 'Poppins', sans-serif;\">\r\n" +
                    "\r\n" +
                    "<h1 style=\"text-align: center; margin-bottom: 0px;color:#CD6060;\"><strong>&nbsp;" + FirstName + "</strong> " + LastName + "</h1>\r\n" +

                    "<p></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"></p>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #CD6060;\" data-darkreader-inline-color=\"\">Personal Information</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Email address</strong>&nbsp; &nbsp; &nbsp;  : " + Email + "</p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Contact No.&nbsp;</strong> &nbsp; &nbsp; &nbsp; &nbsp;  : " + Phone + "</p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>LinkedIn&nbsp&nbsp&nbsp;</strong> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : " + LinkedIn + "</p>\r\n" +
                    "\r\n" +
                    "<p></p>\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #CD6060;\" data-darkreader-inline-color=\"\">Education</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<ul>\r\n" +
                    "<li><strong>" + Institute + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\">&nbsp; &nbsp;Course: " + Course + "<br />&nbsp; &nbsp;Passing Year: " + PassYear + "<br />&nbsp; &nbsp;Grade: " + Grade + "</p>\r\n" +
                    "</li>\r\n" +
                    "</ul>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #CD6060;\">Skills</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Languages Known&nbsp; &nbsp; &nbsp;</strong> &nbsp; &nbsp; &nbsp; &nbsp; :&nbsp; " + LangKnown + "</p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Programming Languages&nbsp;</strong> : " + ProLangKnown + "</p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Other&nbsp; &nbsp;</strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : " + Others + "</p>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #CD6060;\">Work Experience</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<ul>\r\n" +
                    "<li><strong>" + Comp1 + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080; background-color: #ffffff;\">" + JoinDate1 + " - " + EndDate1 + "</span><br />Worked as " + Design1 + "</p><br>\r\n" +
                    "</li>\r\n" +
                    "<li><strong>" + Comp2 + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080; background-color: #ffffff;\">" + JoinDate2 + " - " + EndDate2 + "</span><br />Worked as " + Design2 + "<br /></p>\r\n" +
                    "</li>\r\n" +
                    "</ul>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #CD6060;\">Notable Projects</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<ul>\r\n" +
                    "<li><strong>" + ProjectTitle1 + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\">" + Functionality1 + "</p>\r\n" +
                    "<ul style=\"list-style-type: circle;\">\r\n" +
                    "<li>Technology Used : " + TechStack1 + "</li>\r\n" +
                    "<li>Description : " + ProjDes1 + "</li>\r\n" +
                    "</ul>\r\n" +
                    "</li>\r\n" +
                    "</ul>\r\n" +
                    "<ul>\r\n" +
                    "<li><strong>" + ProjectTitle2 + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\">" + Functionality2 + "</p>\r\n" +
                    "<ul style=\"list-style-type: circle;\">\r\n" +
                    "<li>Technology Used : " + TechStack2 + "</li>\r\n" +
                    "<li>Description : " + ProjDes2 + "</li>\r\n" +
                    "</ul>\r\n" +
                    "</li>\r\n" +
                    "</ul>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #CD6060;\">Achievements</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\">" + AchDate1 + "&nbsp; &nbsp; &nbsp; &nbsp; <strong><span style=\"color: #000000;\">" + Ach1 + "</span></strong></span></p>\r\n" +
                    "<p style=\"padding-left: 60px;margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><span style=\"color: #000000;\">&nbsp;" + AchDes1 + "</span></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><strong><span style=\"color: #000000;\"></span></strong></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\">" + AchDate2 + "&nbsp; &nbsp; &nbsp; &nbsp; <strong><span style=\"color: #000000;\">" + Ach2 + "</span></strong></span></p>\r\n" +
                    "<p style=\"padding-left: 60px;margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #000000;\">&nbsp;" + AchDes2 + "</span></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><strong><span style=\"color: #000000;\"></span></strong></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\">" + AchDate3 + "&nbsp; &nbsp; &nbsp; &nbsp; <strong><span style=\"color: #000000;\">" + Ach3 + "<br /></span></strong><span style=\"color: #000000;\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " + AchDes3 + "</span></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><strong><span style=\"color: #000000;\"></span></strong></span></p>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "</body>\r\n" +
                    "</html>";
        } else if (Template=="2") {
            HTML = "<html>\r\n" +
                    "<head></head>\r\n" +
                    "<body style=\"font-family: 'Poppins', sans-serif;\">\r\n" +
                    "\r\n" +
                    "<h1 style=\"text-align: center; margin-bottom: 0px;color:#2666CF;\"><strong>&nbsp;" + FirstName + "</strong> " + LastName + "</h1>\r\n" +

                    "<p></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"></p>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #2666CF;\" data-darkreader-inline-color=\"\">Personal Information</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Email address</strong>&nbsp; &nbsp; &nbsp;  : " + Email + "</p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Contact No.&nbsp;</strong> &nbsp; &nbsp; &nbsp; &nbsp;  : " + Phone + "</p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>LinkedIn&nbsp&nbsp&nbsp;</strong> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : " + LinkedIn + "</p>\r\n" +
                    "\r\n" +
                    "<p></p>\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #2666CF;\" data-darkreader-inline-color=\"\">Education</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<ul>\r\n" +
                    "<li><strong>" + Institute + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\">&nbsp; &nbsp;Course: " + Course + "<br />&nbsp; &nbsp;Passing Year: " + PassYear + "<br />&nbsp; &nbsp;Grade: " + Grade + "</p>\r\n" +
                    "</li>\r\n" +
                    "</ul>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #2666CF;\">Skills</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Languages Known&nbsp; &nbsp; &nbsp;</strong> &nbsp; &nbsp; &nbsp; &nbsp; :&nbsp; " + LangKnown + "</p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Programming Languages&nbsp;</strong> : " + ProLangKnown + "</p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Other&nbsp; &nbsp;</strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : " + Others + "</p>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #2666CF;\">Work Experience</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<ul>\r\n" +
                    "<li><strong>" + Comp1 + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080; background-color: #ffffff;\">" + JoinDate1 + " - " + EndDate1 + "</span><br />Worked as " + Design1 + "</p><br>\r\n" +
                    "</li>\r\n" +
                    "<li><strong>" + Comp2 + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080; background-color: #ffffff;\">" + JoinDate2 + " - " + EndDate2 + "</span><br />Worked as " + Design2 + "<br /></p>\r\n" +
                    "</li>\r\n" +
                    "</ul>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #2666CF;\">Notable Projects</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<ul>\r\n" +
                    "<li><strong>" + ProjectTitle1 + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\">" + Functionality1 + "</p>\r\n" +
                    "<ul style=\"list-style-type: circle;\">\r\n" +
                    "<li>Technology Used : " + TechStack1 + "</li>\r\n" +
                    "<li>Description : " + ProjDes1 + "</li>\r\n" +
                    "</ul>\r\n" +
                    "</li>\r\n" +
                    "</ul>\r\n" +
                    "<ul>\r\n" +
                    "<li><strong>" + ProjectTitle2 + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\">" + Functionality2 + "</p>\r\n" +
                    "<ul style=\"list-style-type: circle;\">\r\n" +
                    "<li>Technology Used : " + TechStack2 + "</li>\r\n" +
                    "<li>Description : " + ProjDes2 + "</li>\r\n" +
                    "</ul>\r\n" +
                    "</li>\r\n" +
                    "</ul>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #2666CF;\">Achievements</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\">" + AchDate1 + "&nbsp; &nbsp; &nbsp; &nbsp; <strong><span style=\"color: #000000;\">" + Ach1 + "</span></strong></span></p>\r\n" +
                    "<p style=\"padding-left: 60px;margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><span style=\"color: #000000;\">&nbsp;" + AchDes1 + "</span></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><strong><span style=\"color: #000000;\"></span></strong></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\">" + AchDate2 + "&nbsp; &nbsp; &nbsp; &nbsp; <strong><span style=\"color: #000000;\">" + Ach2 + "</span></strong></span></p>\r\n" +
                    "<p style=\"padding-left: 60px;margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #000000;\">&nbsp;" + AchDes2 + "</span></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><strong><span style=\"color: #000000;\"></span></strong></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\">" + AchDate3 + "&nbsp; &nbsp; &nbsp; &nbsp; <strong><span style=\"color: #000000;\">" + Ach3 + "<br /></span></strong><span style=\"color: #000000;\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " + AchDes3 + "</span></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><strong><span style=\"color: #000000;\"></span></strong></span></p>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "</body>\r\n" +
                    "</html>";
        }
        else if (Template=="3") {
            HTML = "<html>\r\n" +
                    "<head></head>\r\n" +
                    "<body style=\"font-family: 'Poppins', sans-serif;\">\r\n" +
                    "\r\n" +
                    "<h1 style=\"text-align: center; margin-bottom: 0px;color:#00c000;\"><strong>&nbsp;" + FirstName + "</strong> " + LastName + "</h1>\r\n" +

                    "<p></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"></p>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #00c000;\" data-darkreader-inline-color=\"\">Personal Information</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Email address</strong>&nbsp; &nbsp; &nbsp;  : " + Email + "</p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Contact No.&nbsp;</strong> &nbsp; &nbsp; &nbsp; &nbsp;  : " + Phone + "</p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>LinkedIn&nbsp&nbsp&nbsp;</strong> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : " + LinkedIn + "</p>\r\n" +
                    "\r\n" +
                    "<p></p>\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #00c000;\" data-darkreader-inline-color=\"\">Education</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<ul>\r\n" +
                    "<li><strong>" + Institute + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\">&nbsp; &nbsp;Course: " + Course + "<br />&nbsp; &nbsp;Passing Year: " + PassYear + "<br />&nbsp; &nbsp;Grade: " + Grade + "</p>\r\n" +
                    "</li>\r\n" +
                    "</ul>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #00c000;\">Skills</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Languages Known&nbsp; &nbsp; &nbsp;</strong> &nbsp; &nbsp; &nbsp; &nbsp; :&nbsp; " + LangKnown + "</p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Programming Languages&nbsp;</strong> : " + ProLangKnown + "</p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\"><strong>Other&nbsp; &nbsp;</strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : " + Others + "</p>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #00c000;\">Work Experience</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<ul>\r\n" +
                    "<li><strong>" + Comp1 + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080; background-color: #ffffff;\">" + JoinDate1 + " - " + EndDate1 + "</span><br />Worked as " + Design1 + "</p><br>\r\n" +
                    "</li>\r\n" +
                    "<li><strong>" + Comp2 + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080; background-color: #ffffff;\">" + JoinDate2 + " - " + EndDate2 + "</span><br />Worked as " + Design2 + "<br /></p>\r\n" +
                    "</li>\r\n" +
                    "</ul>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #00c000;\">Notable Projects</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<ul>\r\n" +
                    "<li><strong>" + ProjectTitle1 + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\">" + Functionality1 + "</p>\r\n" +
                    "<ul style=\"list-style-type: circle;\">\r\n" +
                    "<li>Technology Used : " + TechStack1 + "</li>\r\n" +
                    "<li>Description : " + ProjDes1 + "</li>\r\n" +
                    "</ul>\r\n" +
                    "</li>\r\n" +
                    "</ul>\r\n" +
                    "<ul>\r\n" +
                    "<li><strong>" + ProjectTitle2 + "</strong>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px\">" + Functionality2 + "</p>\r\n" +
                    "<ul style=\"list-style-type: circle;\">\r\n" +
                    "<li>Technology Used : " + TechStack2 + "</li>\r\n" +
                    "<li>Description : " + ProjDes2 + "</li>\r\n" +
                    "</ul>\r\n" +
                    "</li>\r\n" +
                    "</ul>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "<h2 style=\"margin-bottom: 0px;\"><strong><span style=\"color: #00c000;\">Achievements</span></strong></h2>\r\n" +
                    "<hr />\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\">" + AchDate1 + "&nbsp; &nbsp; &nbsp; &nbsp; <strong><span style=\"color: #000000;\">" + Ach1 + "</span></strong></span></p>\r\n" +
                    "<p style=\"padding-left: 60px;margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><span style=\"color: #000000;\">&nbsp;" + AchDes1 + "</span></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><strong><span style=\"color: #000000;\"></span></strong></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\">" + AchDate2 + "&nbsp; &nbsp; &nbsp; &nbsp; <strong><span style=\"color: #000000;\">" + Ach2 + "</span></strong></span></p>\r\n" +
                    "<p style=\"padding-left: 60px;margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #000000;\">&nbsp;" + AchDes2 + "</span></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><strong><span style=\"color: #000000;\"></span></strong></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\">" + AchDate3 + "&nbsp; &nbsp; &nbsp; &nbsp; <strong><span style=\"color: #000000;\">" + Ach3 + "<br /></span></strong><span style=\"color: #000000;\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; " + AchDes3 + "</span></span></p>\r\n" +
                    "<p style=\"margin-bottom: 0px;margin-top: 0px;\"><span style=\"color: #808080;\"><strong><span style=\"color: #000000;\"></span></strong></span></p>\r\n" +
                    "\r\n" +
                    "\r\n" +
                    "</body>\r\n" +
                    "</html>";
        }

        // String to PDF
        HtmlConverter.convertToPdf(HTML, new FileOutputStream(destination+"\\"+FirstName+"_CV.pdf"));

    }
}