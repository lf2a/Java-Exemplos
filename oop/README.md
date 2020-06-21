# Exemplificando um funcionamento básico de um framework para desenvolvimento web

## Classes

- App
- Route
- Request
- *Response
  - HTMLResponse
  - JsonResponse
  - TextPlainResponse
- *Controller

> \*classe abstrata 

## Interfaces

- IResponse
- IController

## Classes Abstratas

- Response
- Controller

## Pacotes

- framework
- framework/http
  - framework/http/response
  - framework/http/request
- framework/router
- framewrk/controller


# OOP

- [OK] Objeto
- [OK] Classe
- [OK] Método (estatico)
- [OK] Herança
- [OK] Interface
- [OK] Polimorfismo (sobrescrita e sobrecarga)
- [OK] Abstração
- [OK] Encapsulamento

## Tipos de acesso

- **Público:** O método é acessível por todas as classes quando usamos o especificador público em nosso aplicativo.

- **Privado:** quando usamos um especificador de acesso privado, o método está acessível apenas nas classes em que está definido.

- **Protegido:** Quando usamos o especificador de acesso protegido, o método é acessível no mesmo pacote ou subclasses em um pacote diferente.

- **Padrão:** quando não usamos nenhum especificador de acesso na declaração do método, o Java usa o especificador de acesso padrão por padrão. É visível apenas do mesmo pacote.
