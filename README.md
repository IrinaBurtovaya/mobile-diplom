## ✨ Проект автоматизации тестирования мобильного приложения Wikipedia.
#### Проект создан в рамках обучения в школе QA.GURU и представляет из себя часть выпускной работы.
### <a target="_blank" href="https://qa.guru/">Перейти на сайт школы</a>

### 💎Содержание:

- <a href="#технологии-и-инструменты">Технологии и инструменты</a>
- <a href="#реализованные-проверки">Реализованные проверки</a>
- <a href="#сборка-в-jenkins">Сборка в Jenkins</a>
- <a href="#запуск-из-терминала">Запуск из терминала</a>
- <a href="#allure-отчет">Allure отчет</a>
- <a href="#Allure-TestOps-отчет">Allure TestOps отчет</a>
- <a href="#отчет-в-telegram">Отчет в Telegram</a>

### 💎[Технологии и инструменты](#технологии-и-инструменты)
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="logo/Java.svg">
<img width="6%" title="Selenide" src="logo/Selenide.svg">
<img width="6%" title="Allure Report" src="logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="logo/Gradle.svg">
<img width="6%" title="JUnit5" src="logo/JUnit5.svg">
<img width="6%" title="GitHub" src="logo/GitHub.svg">
<img width="6%" title="Jenkins" src="logo/Jenkins.svg">
<img width="6%" title="Browserstack" src="logo/br.jpg">
<img width="6%" title="Telegram" src="logo/Telegram.svg">
</p>

### 💎[Реализованные проверки](#реализованные-проверки)
* Проверка поиска.
* Проверка страниц онбоардинга.
* Проверка текста объявления.
* Проверка очистки поля поиска.

### 💎[Сборка в Jenkins](#сборка-в-jenkins)
#### <a target="_blank" href="https://jenkins.autotests.cloud/job/c12-iburtovaya-mobile-diplom/">Перейти на сборку</a>

### 💎[Запуск из терминала](#запуск-из-терминала)
* #### Локальный запуск тест-кейсов
gradle clean test -DdeviceHost=emulation

* #### Удаленный запуск тест-кейсов
gradle clean test -DdeviceHost=browserstack

### 💎[Allure отчет](#allure-отчет)
#### Сводные данные
![Img1](logo/report.jpg)

#### Тест-кейсы
![Img2](logo/allurecase.jpg)

### 💎[Allure TestOps отчет](#Allure-TestOps-отчет)
#### Тест-кейсы
![Img3](logo/cases.jpg)

#### Dashboard
![Img4](logo/testops.jpg)

### 💎[Отчет в Telegram](#отчет-в-telegram)
Для быстрого реагирования на результаты прохождения тест-кейсов, на проекте настроены быстрые уведомления в Telegram.
Уведомления выглядят следующим образом:

![Img5](logo/tg.jpg)

❤️ <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
💙 <a target="_blank" href="https://t.me/qa_guru_chat">t.me/qa_guru_chat</a>