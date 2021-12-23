
Feature: HepsiBurada test senaryoları

  Scenario Outline: HepsiBurada Ürün Arama Testi
    Given Kullanıcı anasayfayı ziyaret eder
    When Arama kutusuna "<searchKey>" yazıp arattığında
    Then Arama sonuçlarında "<searchKey>" görmelidir
    Examples:
      | searchKey |
      | şampuan   |
      | sabun     |
      | tarak     |

  @positive
  Scenario: HepsiBurada Sepete Ürün Ekleme Testi
    Given Kullanıcı anasayfaya gider
    When Anasayfadan bir ürüne girer ve sepete ekleye tıklar
    Then Ürün sepete eklendi yazısı içeren bir popup görür

  @negative
  Scenario: HepsiBurada login işlemi olmadan bi ürünü favorilere ekleme testi
    Given Kullanıcı anasayfaya girer
    When Anasayfadan bir ürüne girer ve favorilere eklemeye çalışarak kalp emojisine basılır
    Then Kullanıcı login işlemine yönlendirildiği bir sayfa görür





