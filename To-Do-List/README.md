# To-Do List API - Spring Boot Projesi

Bu proje, Spring Boot öğrenme sürecimde geliştirdiğim temel bir CRUD (Create, Read, Update, Delete) API'sidir. Uygulama, görev ekleme, listeleme, güncelleme ve silme gibi temel işlemleri gerçekleştiren RESTful endpoint'ler içerir.

Bu proje, backend geliştirme yeteneklerimi sergilemek ve temel Spring Boot konseptlerini uygulamak amacıyla oluşturulmuştur.

## Kullanılan Teknolojiler
- Java 23
- Spring Boot 3.5.4
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

## API Endpoint'leri
Aşağıdaki endpoint'ler Postman gibi bir araç ile test edilebilir.

- **Tüm görevleri getir:**
  `GET /api/todo/list`

- **ID ile tek bir görev getir:**
  `GET /api/todo/list/{id}`

- **Yeni bir görev ekle:**
  `POST /api/todo/save`
  *Body (JSON Örneği):*
  ```json
  {
      "baslik": "Yeni Görev",
      "aciklama": "Bu görevin açıklaması.",
      "tamamlandi": false
  }
- **Görev sil:**
  `DELETE /api/todo/delete/{id}`
  
  - **Görev güncelle:**
  `PUT /api/todo/update/{id}`
  *Body (JSON Örneği):*
  ```json
  {
      "baslik": "Yeni Görev",
      "aciklama": "Bu görevin açıklaması.",
      "tamamlandi": true
  }
  
  
  
  