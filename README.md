# Automation workshop Jumbo store

The automation of a purchase flow for the cheapest `Chorizo` product on
the [Jumbo stores website](https://www.tiendasjumbo.co/) is performed.

## Guidelines

#### For this challenge the following must be used:

1. Use at least the following tools:
    - Selenium.
    - Serenity BDD.
    - Cucumber.
2. Use Gherkin language.
3. ScreenPlay design pattern.

#### In addition, some conditions:

- Must run on Coach machine (watch out for `Locators`).
- Prohibited to use `Thread.sleep();`.
- Step Definitions with little logic.
- Use `Try/catch` sentences.
- Must not include credentials in the repo.
- Case must include login.
- Deadline 5:00 PM.

### Value-added

- Perform Hook configuration.
- Use of online scenarios.
- A scenario that allows to buy more than 1 product.

> **Note**
> - Use all the tools learned with ScreenPlay.
> - If implicit waits will be used, it should be through the `serenity.properties` file.
> - The user and password must be changeable in a `valores.properties` file.
> - If explicit waits will be used, follow provided example.
> - The project must have configured waits of **ONE TYPE** only.

### Case

As a precondition, an account must already be created and functional on the site. The access credentials must be
modified in the resource `valores.properties` hosted in `AutoJumbo/src/test/resources`, and must have the following
format.

```properties
EMAIL=example@gmail.com
PASSWORD=examplePassword
```

#### Then, the case proceeds with the following steps:

1. Enter the website [https://www.tiendasjumbo.co/](https://www.tiendasjumbo.co/).
![image](https://user-images.githubusercontent.com/70449743/228922617-9f92d023-6a87-4a72-ad48-93a4ff3b2979.png)

2. Click on 'Mi Cuenta'.
![image](https://user-images.githubusercontent.com/70449743/228922718-63396109-24ef-44e3-ba44-7bec7c85a263.png)

3. Enter e-mail and password in the section 'Entrar con e-mail y contraseña'.
![image](https://user-images.githubusercontent.com/70449743/228922895-262952f3-74dc-4532-92b4-43be2c069d80.png)

4. Login.
![image](https://user-images.githubusercontent.com/70449743/228923620-69b653fd-6f67-4421-8d8f-f8c1ec30b785.png)

5. Search for the word 'Chorizo' in the search box.
![image](https://user-images.githubusercontent.com/70449743/228923932-b494dd86-dc9d-4c9f-bd06-2aed8f0b2a27.png)

6. Select category 'Lácteos, Huevos Y Refrigerados'.
![image](https://user-images.githubusercontent.com/70449743/228924141-0860616e-e522-41c8-a68a-6991a960f7dc.png)

7. Set shipping address.
![image](https://user-images.githubusercontent.com/70449743/228924329-01ea71e0-fd05-4976-a0b3-2c5aa04a6a7a.png)
![image](https://user-images.githubusercontent.com/70449743/228924473-0ca4a0a7-8f67-4e5d-9877-710e6a157cba.png)

8. Add to cart the lowest cost product.
![image](https://user-images.githubusercontent.com/70449743/228924748-80ac1e95-a1e5-441b-8c45-a85639f4a04c.png)

9. Take the process to the checkout screen.
![image](https://user-images.githubusercontent.com/70449743/228924895-98717442-6709-4ab3-af44-e012228ef701.png)
![image](https://user-images.githubusercontent.com/70449743/228925436-060ccd50-b35c-4854-9997-ee6ec5e082e2.png)

- - -
*By: Jonathan Vargas 🐢 Ococho*

<a href="https://gitmoji.dev">
  <img
    src="https://img.shields.io/badge/gitmoji-%20😜%20😍-FFDD67.svg?style=flat-square"
    alt="Gitmoji"
  />
</a>
