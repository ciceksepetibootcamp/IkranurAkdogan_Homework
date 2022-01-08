## Nefis Yemek Tarifleri Mobil Uygulaması ile Page Object Model, Appium, Android Studio, IntellijIDEA Kullanılarak bir Mobil Test Otomasyonu Projesi gerçekleştirilmiştir. 
#### Bu projede 6 adet Test oluşturulmuştur.
## Pages:
-BasePage
-HomePage
-LoginPage

## Tests:
-BaseTest
-LoginTest
-MyRecipeTest
-SearchRecipeTest

## LoginTest (Bu test class'ında LoginPage kullanılmıştır.)

![loginTest](https://user-images.githubusercontent.com/65242155/148581458-ac120894-4cdd-48db-b3bf-b83da3d8f055.png)

#### Test 1: wrongPasswordLoginTest()

- Nefis Yemek Tarifleri Mobil Uygulamasına yanlış şifre ile giriş yapılmaya çalışılır ve Uyarı mesajı alınır.
![yanlışşifreile_LOGİN](https://user-images.githubusercontent.com/65242155/148583862-5285bec2-78ab-4c64-b307-7a9e443291ca.gif)


![yanlışşifre_login](https://user-images.githubusercontent.com/65242155/148581137-f60ed5aa-582d-4eb4-9d72-8ca1523a116b.png)

       Test Status : Passed ✅


#### Test 2: validPasswordLoginTest()

- Nefis Yemek Tarifleri Mobil Uygulamasına doğru şifre ile giriş yapılır.

![doğruŞifre_login](https://user-images.githubusercontent.com/65242155/148583900-4ef4a569-5631-48c3-a384-9263f776d8ae.gif)


![doğruşifre_login](https://user-images.githubusercontent.com/65242155/148581256-26270e7d-81f7-428b-9b39-83c63aa6010f.png)

       Test Status : Passed ✅
       
## MyRecipeTest (Bu test class'ında LoginPage ve HomePage kullanılmıştır.)

![myRecipeTestFoto](https://user-images.githubusercontent.com/65242155/148581973-74b07f83-199b-4cdf-b7cf-260257a0f8b9.png)

#### Test 1: saveRecipeTest()

- LoginPage ile login işlemi yapılır ve kullanıcı Tarifler'ine yeni bir tarif ekleme işlemi yapar. Fotoğraf eklenmediği için taslaklara kaydeder.

![tarifekliyor](https://user-images.githubusercontent.com/65242155/148583941-b368d80b-1988-4365-b64b-53577ff0edda.gif)


![TARİFeKLE](https://user-images.githubusercontent.com/65242155/148581950-5705a7c1-728d-4330-bed8-a97bd895c595.png)

       Test Status : Passed ✅

#### Test 2: deleteRecipeTest()

- LoginPage ile login işlemi yapılır ve kullanıcı kayıtlı Tarifler'inden bir tarif silme işlemi yapar.

![tarifsiliyor](https://user-images.githubusercontent.com/65242155/148583964-6ce6464c-c409-40d5-9ba3-694e4c31c3b7.gif)


![EKLENENTARİFİSİL](https://user-images.githubusercontent.com/65242155/148582146-d31f3224-0fd1-433a-a047-016048da6d1d.png)


       Test Status : Passed ✅
       
## SearchRecipeTest (Bu test class'ında HomePage kullanılmıştır.)

 ![searchRecipeTestFoto](https://user-images.githubusercontent.com/65242155/148582264-b436abec-62a6-4617-8caa-9c5bca6845b7.png)

  
 #### Test 1: searchItemRecipeTest()
 
- Login işlemi yapmaya gerek duymadan kullanıcı menüden 'Tarif Ara'ya tıklayarak bir tarif aratır ve ilerler.

![mantiARA_KISASÜRE](https://user-images.githubusercontent.com/65242155/148584003-db263f13-9664-47bc-aaf1-b6558fbc1a2c.gif)


![TARİFARA](https://user-images.githubusercontent.com/65242155/148582414-fe7cbbe7-1877-4f79-bf4b-87967f7a92b8.png)

       Test Status : Passed ✅

#### Test 2: deleteRecipeTest()

-Login işlemi yapmaya gerek duymadan searchItemRecipeTest() ile kullanıcı 'Tarif Ara'ya tıklayarak bir tarif aratır ve ilerler.
-Ardından tarif aramalarından aranan tarifi kaldırma işlemini gerçekleştirir ve 'son aranan kelime yok' yazısını kontrol eder.

![MANTIARAVESİL_KISASÜRE](https://user-images.githubusercontent.com/65242155/148584029-f768955b-1850-42fb-b5ec-b70d1dccd1fe.gif)


![ARANATARİFİSiLARANANLARDAN](https://user-images.githubusercontent.com/65242155/148582580-791326b5-a687-4e31-a93d-a61bc9807a89.png)

       Test Status : Passed ✅




