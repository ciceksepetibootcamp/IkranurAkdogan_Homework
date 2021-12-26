import pytest
import time
import json
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities


class HomePage:
    def __init__(self, driver):
        self.driver = driver
        self.searchData_xpath = "//input[@placeholder='Milyonlarca ürün arasında arama yapın']"

        self.searchButton_css = ".searchBtn"
        self.product_css = "#p-422486329 .lazy"
        self.basket_linkText = "Sepete Ekle"
        self.goBasket_linkText = "Sepete Git"
        self.addBasketButton_css = ".btnAddBasket"

        self.loginButton_linkText = "Giriş Yap"
        self.forgotPassword_id = "forgotPassword"
        self.forgottenUserEmail_id = "forgottenUserEmail"
        self.sendLinkForPasswordBtn_id = "sendLinkForPasswordBtn"

        self.myBasket_css = ".myBasket"

    def addToBasket(self):
        time.sleep(1)
        self.driver.get("https://www.n11.com/")
        time.sleep(1)
        self.driver.find_element(By.XPATH, self.searchData_xpath).click()
        time.sleep(1)
        self.driver.find_element(By.XPATH, self.searchData_xpath).send_keys("sabun")
        time.sleep(1)
        # self.driver.find_element(By.CSS_SELECTOR, self.searchButton_css,).send_keys(Keys.ENTER)
        self.driver.find_element(By.XPATH, self.searchData_xpath).send_keys(Keys.ENTER)
        time.sleep(1)
        self.driver.find_element(By.CSS_SELECTOR, self.product_css).click()
        time.sleep(1)
        self.driver.find_element(By.CSS_SELECTOR, self.addBasketButton_css).click()
        time.sleep(1)
        self.assertText = self.driver.find_element(By.LINK_TEXT, self.goBasket_linkText).get_attribute("title")
        print(self.assertText)

    def forgottenPasswordReset(self, fUserEmail):
        self.driver.get("https://www.n11.com/")
        time.sleep(3)
        self.driver.find_element(By.LINK_TEXT, self.loginButton_linkText).click()
        time.sleep(1)
        self.driver.find_element(By.ID, self.forgotPassword_id).click()
        time.sleep(1)
        self.driver.find_element(By.ID, self.forgottenUserEmail_id).click()
        self.driver.find_element(By.ID, self.forgottenUserEmail_id).send_keys(fUserEmail)
        self.driver.find_element(By.ID, self.sendLinkForPasswordBtn_id).click()
        time.sleep(2)
        self.driver.find_element(By.ID, self.forgottenUserEmail_id).send_keys(Keys.ENTER)
        time.sleep(1)

    def basketControl(self):
        self.driver.get("https://www.n11.com/")
        time.sleep(1)
        self.driver.find_element(By.CSS_SELECTOR, self.myBasket_css).click()
        time.sleep(1)
