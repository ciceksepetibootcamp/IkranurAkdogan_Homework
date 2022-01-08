
Feature: Nefis Yemek Tarifleri Mobil test senaryoları


  Scenario Outline: Nefis Yemek Tarifleri Basarılı Login Testi
    Given Kullanıcı Anasayfaya Gider
    When Menüye girer ve Giriş yapa tıklayarak "<email>" ve doğru "<password>" ile login işlemi yapar
    Then Anasayfaya giriş yaptığını görür
    Examples:
    |email|password|
    | ciceksepetics@gmail.com | S1234cicek.|


  Scenario Outline: Nefis Yemek Tarifleri Başarısız Login Testi
    Given Kullanıcı Anasayfaya Gider
    When Menüye girer ve Giriş yapa tıklayarak "<email>" ve yanlış "<password>" ile login işlemi yapar
    Then Anasayfaya giriş yapamaz ve uyarı mesajı görür
    Examples:
      | email     | password     |
      | ciceksepetics@gmail.com | S1234cicek.. |

  Scenario: Nefis Yemek Tarifleri Taslağa Tarif Ekleme Testi
    Given Kullanıcı Anasayfaya Ulasır
    When Menüye girerek Giriş yapa tıklar ve doğru şifre ile login işlemi gerceklestirir
    And Tariflerime girerek yeni tarif oluştura tıklar ve bilgileri doldurarak tarifi yayınlaya tıklar
    Then Kullanıcı fotoğraf yüklemesi gerektiği uyarı mesajını görür ve tarif taslak olarak keydedilir

  Scenario: Nefis Yemek Tarifleri Taslaklardan Tarif Silme Testi
    Given Kullanıcı Anasayfaya Ulasır
    When Menüye girerek Giriş yapa tıklar ve doğru şifre ile login işlemi gerceklestirir
    And Kullanıcı tariflerime gelerek bir tarifi silmek için butona basar
    Then Kullanıcı tarifin silindiğini görür


  Scenario Outline: Nefis Yemek Tarifleri Tarif Arama Testi
    Given Kullanıcı Anasayfaya Gelir
    When Kullanıcı menüye gelir tarif araya tıklayarak "<searchKey>" tarifini aratır ve adımları takip eder
    Then Kullanıcı arama sonuçlarını görür
    Examples:
    |searchKey|
    | mantı |


  Scenario Outline: Nefis Yemek Tarifleri Aranan Tarifi Aramalardan Silme Testi
    Given Kullanıcı Anasayfaya Gelir
    When Kullanıcı menüye gelir tarif araya tıklayarak "<searchKey>" tarifini aratır ve adımları takip eder
    And Kullanıcı arama sonuçlarını gördükten sonra geriye giderek anasayfaya gelir ve tekrar menüden tarif araya tıklayarak arama sonuçlarından aranan kelimeyi siler
    Then Arama sonuçlarında aranan kelimenin silindiğini ve "<message>" yazısını görür
    Examples:
      |searchKey| message |
      | mantı | Son aranan kelime yok |