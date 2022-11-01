# A101_Test_Automation_Practicum_Final_Case<br>
Patika.dev ile gerçekleştirilen A101 Test Otomasyon Final Case'i<br>
- [**Proje Hakkında**](https://github.com/frknztrkk/A101_Test_Automation_Practicum_Final_Case#proje-hakk%C4%B1nda)
  - [Açıklama](https://github.com/frknztrkk/A101_Test_Automation_Practicum_Final_Case#a%C3%A7%C4%B1klama)
  - [Kullanılan Teknolojiler ve Kütüphaneler](https://github.com/frknztrkk/A101_Test_Automation_Practicum_Final_Case#kullan%C4%B1lan-teknolojiler-ve-k%C3%BCt%C3%BCphaneler)
- [**Testler**](https://github.com/frknztrkk/A101_Test_Automation_Practicum_Final_Case/blob/main/README.md#testler)
   - [&#8544; .Test Adımları](https://github.com/frknztrkk/A101_Test_Automation_Practicum_Final_Case/blob/main/README.md#%E2%85%B0-test-ad%C4%B1mlar%C4%B1)
   - [&#8545; .Test Adımları](https://github.com/frknztrkk/A101_Test_Automation_Practicum_Final_Case/blob/main/README.md#%E2%85%B1-test-ad%C4%B1mlar%C4%B1)
- [**Testleri Çalıştırmak İçin Gerekli Olanlar**](https://github.com/frknztrkk/A101_Test_Automation_Practicum_Final_Case/blob/main/README.md#testleri-%C3%A7al%C4%B1%C5%9Ft%C4%B1rmak-i%CC%87%C3%A7in-gerekli-olanlar);
  - [Projeyi GitHub Üzerinden Kopyalamak İçin](https://github.com/frknztrkk/A101_Test_Automation_Practicum_Final_Case/blob/main/README.md#projeyi-github-%C3%BCzerinden-kopyalamak-i%C3%A7in);
  - [Testleri Koşmak İçin](https://github.com/frknztrkk/A101_Test_Automation_Practicum_Final_Case/blob/main/README.md#testleri-ko%C5%9Fmak-i%CC%87%C3%A7in);


## Proje Hakkında
#### Açıklama
Proje POM(Page Object Model) olarak yazılıp Clean Code tekniğine uygun yazılmıştır. Hepsiburada sayfası üzerinde 2 adet Test'ten oluşmaktadır.Bu testler arasındaki fark şudur birinde kullanıcı girişi yapılarak test adımlarına devam edilmesidir.<br>
Bu projede testleri farklı yöntemlerle çalıştırma seçenekleri mevcuttur.<br>
> * Paralel Test:Aynı anda iki testide çalıştırma imkanı bu sayede zamandan tasarruf edilir.<br>
> * Sıralı Test:Testleri arka arkaya çalıştırma imkanı sağlar.<br>
> * Farklı browser aracılığı ile test: Testler farklı browserlar üzerinde koşulabilir.Bu sayede test daha geniş kapsamlı tüm platformlarda koşmuş olur.<br>

Raporlama seçeneği ile testin aldığı hataları veya testin geçtiğini bir HTML dokümanı üzerinden okuyabilme imkanı ayrıca hataların ekran görüntüleri de 
hatalara ek olarak bu raporlamada görünebilir.<br>
Ayrıca Log kayıtları ile bu testin kayıtlarını farklı bir Text dosyasına kayıt ederek kontrol etme imkanı tanır.

#### Kullanılan Teknolojiler ve Kütüphaneler
* **Selenium**: Selenium WebDriver, komutları kabul eden ve bunları bir tarayıcıya gönderen bir tarayıcı otomasyon çerçevesidir.
* **TestNG**: TestNG , JUnit ve NUnit hatlarında geliştirilen bir test çerçevesidir.TestNG kullanılmasındaki sebepler daha geniş kapsamlı bir annotation desteği,paralel test yapabilme imkanı ayrıca paralel olarak farklı browserlarda çalışma özelliği,Listener'lar sayesinde daha kapsamlı bir log kayıt tutabilme imkanı.
* **Extent Report**: HTML Raporlama kütüphanesi olan ExtentReports, Java ve .NET için açık kaynaklı bir raporlama API’sidir.

## Testler

#### &#8544; .Test Adımları;<br>
> * Kullanıcı girişi yapılarak sepete ürün eklenmesi <br>
> * Kullanıcı Hepsiburada.com sitesini ziyaret eder.<br>
> * Kullanıcı giriş işlemi yapılır.<br>
> * Yönlendirmeden sonra anasayfada kullanıcı giriş işleminin yapıldığı doğrulanır<br>
> * Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.<br>
> * Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.<br>
> * Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.<br>
> * Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.<br>


#### 	&#8545; .Test Adımları;<br><br>
> * Kullanıcı girişi yapılmadan belirtilen ürünü sepete ekleme<br>
> * Kullanıcı Hepsiburada.com sitesini ziyaret eder.<br>
> * Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.<br>
> * Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.<br>
> * Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.<br>

## Testleri Çalıştırmak İçin Gerekli Olanlar<br>
* İntellij İdea/Eclipse vb. IDE bilgisayarınızda kurulu olmalıdır.
* Projeyi IDE'nize kopyalamanız gerekmektedir.
* Gerekli kurulumlar yapıldıktan sonra testng.xml dosyasına sağ tıklayıp run test seçeneğine tıklanmalıdır.

#### Projeyi GitHub üzerinden kopyalamak için<br>
> * Intellij Idea'yı Açın
> * File>New>Project from Version Control... seçeneğine tıklayın.<br><br>
> ![VCS](https://user-images.githubusercontent.com/105914984/199110496-e391201c-0656-4d9b-bb07-f6ca618eb8af.PNG)<br>
> * Proje Url'sini GitHub üzerinden kopyalıp buradaki URL kısmına yapıştırın ve clone butonuna tıklayın.<br><br>
>![clone](https://user-images.githubusercontent.com/105914984/199110051-a6b87051-18da-4ed8-b5d3-9fdedad38060.PNG)<br>

#### Testleri Koşmak İçin<br>
> * testng.xml dosyasının üzerine gelip sağ tıklayın ve Run '...\testng.xml' seçeneğine tıklayın.<br><br>
> ![run](https://user-images.githubusercontent.com/105914984/199112947-f8deb273-368b-4866-bf86-27d9027f6c38.PNG)





