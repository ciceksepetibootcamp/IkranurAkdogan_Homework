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
from Pages.homePage import HomePage


class TestTest1:

    @pytest.fixture()
    def test_setup(self):
        global driver
        driver = webdriver.Chrome('C:/chromedriver.exe')
        driver.implicitly_wait(8)
        driver.maximize_window()

        yield
        driver.close()
        driver.quit()

    def test_pom_product(self, test_setup):
        home = HomePage(driver)
        home.addToBasket()
        time.sleep(3)

    def test_pom_basket(self, test_setup):
        self.test_pom_product(test_setup)
        time.sleep(3)
        HomePage(driver).basketControl()
        time.sleep(3)
        assert driver.find_element(By.ID, "js-buyBtn").text == "Satın Al"

    def test_pom_passwordReset(self, test_setup):
        self.fUserEmail = "sepetic41@gmail.com"
        HomePage(driver).forgottenPasswordReset(self.fUserEmail)
        time.sleep(3)
