// Generated by Selenium IDE
using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.Remote;
using OpenQA.Selenium.Support.UI;
using OpenQA.Selenium.Interactions;
using NUnit.Framework;


namespace Dotnet_Homework
{

    public class BasePage
    {
        public static IWebDriver driver;

        public void Initialize()
        {

            driver = new ChromeDriver(@"C:\");
            driver = new ChromeDriver(@"C:\");
            driver.Manage().Window.Maximize();
            driver.Navigate().GoToUrl("https://www.n11.com/");
        }

        public void TearDown()
        {
            driver.Quit();
        }

    }

}