## Nefis Yemek Tarifleri Mobil Uygulaması ile BDD Cucumber, Appium, Android Studio, IntellijIDEA Kullanılarak bir Mobil Test Otomasyonu Projesi gerçekleştirilmiştir. 
#### Bu projede 6 adet Senaryo oluşturulmuştur.

#### Pages:
-BasePage
-HomePage
-LoginPage

##### Tests:
-BaseTest
-LoginTest
-MyRecipeTest
-SearchRecipeTest

## Senaryolar-> Feature: Nefis Yemek Tarifleri Mobil test senaryoları

## LoginTest Senaryoları (Bu test class'ında LoginPage kullanılmıştır.)

  ##### Scenario Outline: Nefis Yemek Tarifleri Basarılı Login Testi    ->LoginTest
  
    Given Kullanıcı Anasayfaya Gider    -> kullanıcıAnasayfayaGider()
    When Menüye girer ve Giriş yapa tıklayarak "<email>" ve doğru "<password>" ile login işlemi yapar   ->validPasswordLoginTest()
    Then Anasayfaya giriş yaptığını görür   ->anasayfayaGirişYaptığınıGörür()
    Examples:
    |email|password|
    | ciceksepetics@gmail.com | S1234cicek.|
    
![doğruŞifre_login](https://user-images.githubusercontent.com/65242155/148583900-4ef4a569-5631-48c3-a384-9263f776d8ae.gif)

    
![başarılı_login](https://user-images.githubusercontent.com/65242155/148628222-a94a3a60-5669-4c89-a269-40ebabb83e86.png)

           Test Status : Passed ✅



  ##### Scenario Outline: Nefis Yemek Tarifleri Başarısız Login Testi   ->LoginTest

  
    Given Kullanıcı Anasayfaya Gider    -> kullanıcıAnasayfayaGider()
    When Menüye girer ve Giriş yapa tıklayarak "<email>" ve yanlış "<password>" ile login işlemi yapar    ->wrongPasswordLoginTest()
    Then Anasayfaya giriş yapamaz ve uyarı mesajı görür   ->uyarıMesajıGörür()
    Examples:
      | email     | password     |
      | ciceksepetics@gmail.com | S1234cicek.. |
      
![yanlışşifreile_LOGİN](https://user-images.githubusercontent.com/65242155/148583862-5285bec2-78ab-4c64-b307-7a9e443291ca.gif)
      
![başarısız_login2](https://user-images.githubusercontent.com/65242155/148628227-66bf0d11-3354-433a-9942-4571ac2096ce.png)
      
             Test Status : Passed ✅

 
 ## MyRecipeTest Senaryoları (Bu test class'ında LoginPage ve HomePage kullanılmıştır.)
  ##### Scenario: Nefis Yemek Tarifleri Taslağa Tarif Ekleme Testi  ->MyRecipeTest
  

    Given Kullanıcı Anasayfaya Ulasır     ->kullanıcıAnasayfayaUlasır()
    When Menüye girerek Giriş yapa tıklar ve doğru şifre ile login işlemi gerceklestirir    ->loginForRecipeTest()
    And Tariflerime girerek yeni tarif oluştura tıklar ve bilgileri doldurarak tarifi yayınlaya tıklar  ->saveRecipeTest()
    Then Kullanıcı fotoğraf yüklemesi gerektiği uyarı mesajını görür ve tarif taslak olarak keydedilir  ->saveRecipeMessageTest()

 ![tarifekliyor](https://user-images.githubusercontent.com/65242155/148583941-b368d80b-1988-4365-b64b-53577ff0edda.gif)
    
![tarifekleme3](https://user-images.githubusercontent.com/65242155/148628232-67141e2c-ff7b-49d5-829c-41ed622b8041.png)
    
           Test Status : Passed ✅


  ##### Scenario: Nefis Yemek Tarifleri Taslaklardan Tarif Silme Testi  ->MyRecipeTest
  

    Given Kullanıcı Anasayfaya Ulasır   ->kullanıcıAnasayfayaUlasır()
    When Menüye girerek Giriş yapa tıklar ve doğru şifre ile login işlemi gerceklestirir    ->loginForRecipeTest()
    And Kullanıcı tariflerime gelerek bir tarifi silmek için butona basar  ->deleteRecipeTest() 
    Then Kullanıcı tarifin silindiğini görür    ->successDeleteRecipeTest()
    
![tarifsiliyor](https://user-images.githubusercontent.com/65242155/148583964-6ce6464c-c409-40d5-9ba3-694e4c31c3b7.gif)
 
 
![tarifSilme4](https://user-images.githubusercontent.com/65242155/148628242-9e24608d-f13f-42c7-af23-0888f145e0cf.png)
    
           Test Status : Passed ✅


## SearchRecipeTest Senaryoları (Bu test class'ında HomePage kullanılmıştır.)

  ##### Scenario Outline: Nefis Yemek Tarifleri Tarif Arama Testi  ->SearchRecipeTest
  

    Given Kullanıcı Anasayfaya Gelir    ->goToHomePage()
    When Kullanıcı menüye gelir tarif araya tıklayarak "<searchKey>" tarifini aratır ve adımları takip eder ->searchItemRecipeTest()
    Then Kullanıcı arama sonuçlarını görür    ->sawSearchResultsTest()
    Examples:
    |searchKey|
    | mantı |
    
![mantiARA_KISASÜRE](https://user-images.githubusercontent.com/65242155/148584003-db263f13-9664-47bc-aaf1-b6558fbc1a2c.gif)


![5 senaryo_tarifAra](https://user-images.githubusercontent.com/65242155/148628251-3cc452ed-a2ae-4f29-b830-5e768553af62.png)
    
           Test Status : Passed ✅



  ##### Scenario Outline: Nefis Yemek Tarifleri Aranan Tarifi Aramalardan Silme Testi ->SearchRecipeTest
  
  
    Given Kullanıcı Anasayfaya Gelir    ->goToHomePage()
    When Kullanıcı menüye gelir tarif araya tıklayarak "<searchKey>" tarifini aratır ve adımları takip eder ->searchItemRecipeTest()
    And Kullanıcı arama sonuçlarını gördükten sonra geriye giderek anasayfaya gelir 
    ve tekrar menüden tarif araya tıklayarak arama sonuçlarından aranan kelimeyi siler   ->deleteItemRecipeTest()
    Then Arama sonuçlarında aranan kelimenin silindiğini ve "<message>" yazısını görür  ->sawSearchResultsBeforeTest()
    Examples:
      |searchKey| message |
      | mantı | Son aranan kelime yok |
      
![MANTIARAVESİL_KISASÜRE](https://user-images.githubusercontent.com/65242155/148584029-f768955b-1850-42fb-b5ec-b70d1dccd1fe.gif)


![tarifiArananlardanSilme6](https://user-images.githubusercontent.com/65242155/148628264-26da1c44-fd4d-46e9-b29d-02e0ff41ed68.png)
      
             Test Status : Passed ✅

