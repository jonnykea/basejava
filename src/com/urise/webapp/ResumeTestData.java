package com.urise.webapp;

import com.urise.webapp.model.*;

import java.time.Month;
import java.util.*;

import static com.urise.webapp.model.ContactType.*;
import static com.urise.webapp.model.SectionType.*;

public class ResumeTestData {

    public static final String UUID_0 = UUID.randomUUID().toString();
    public static final String UUID_1 = UUID.randomUUID().toString();
    public static final String UUID_2 = UUID.randomUUID().toString();
    public static final String UUID_3 = UUID.randomUUID().toString();
    public static final String UUID_4 = UUID.randomUUID().toString();
    public static final String UUID_NOT_EXIST = "dummy";

/*    final Resume RESUME_1 = new Resume(UUID_1, "Jon");
    final Resume RESUME_2 = new Resume(UUID_2, "Max");
    final Resume RESUME_3 = new Resume(UUID_3, "Anna");
    final Resume RESUME_4 = new Resume(UUID_4, "Andrew");*/

    public static final Resume RESUME_1 = ResumeTestData.fillAllResumeFields(UUID_0, "Max");
    public static final Resume RESUME_2 = ResumeTestData.fillAllResumeFields(UUID_1, "Jon");
    public static final Resume RESUME_3 = ResumeTestData.fillAllResumeFields(UUID_2, "Anna");
    public static final Resume RESUME_4 = ResumeTestData.fillAllResumeFields(UUID_3, "Andrew");

    public static void main(String[] args) {
        TextSection objective = new TextSection("Ведущий стажировок и корпоративного обучения по Java Web и " +
                "Enterprise технологиям");
        TextSection personal = new TextSection("Аналитический склад ума, сильная логика, креативность, инициативность." +
                " Пурист кода и архитектуры.");
        ListSection achievement = new ListSection("Организация команды и успешная реализация " +
                "Java проектов для сторонних заказчиков: приложения автопарк на стеке Spring Cloud/микросервисы, " +
                "система мониторинга показателей спортсменов на Spring Boot, участие в проекте МЭШ на Play-2, " +
                "многомодульный Spring Boot + Vaadin проект для комплексных DIY смет",
                "С 2013 года: разработка проектов. Разработка Web приложения, Java Enterprise, " +
                        "Многомодульный maven. Многопоточность. XML (JAXB/StAX). Веб сервисы (JAX-RS/SOAP). " +
                        "Удаленное взаимодействие (JMS/AKKA). Организация онлайн стажировок и ведение проектов. " +
                        "Более 3500 выпускников.",
                "Реализация двухфакторной аутентификации для онлайн платформы управления проектами Wrike. Интеграция с " +
                        "Twilio, DuoSecurity, Google Authenticator, Jira, Zendesk.",
                "Реализация двухфакторной аутентификации для онлайн платформы управления проектами Wrike. Интеграция с " +
                        "Twilio, DuoSecurity, Google Authenticator, Jira, Zendesk.", "Налаживание процесса разработки и" +
                " непрерывной интеграции ERP системы River BPM. Интеграция с 1С, Bonita BPM, CMIS, LDAP. Разработка " +
                "приложения управления окружением на стеке: Scala/Play/Anorm/JQuery. Разработка SSO аутентификации и" +
                " авторизации различных ERP модулей, интеграция CIFS/SMB java сервера.",
                "Реализация c нуля Rich Internet Application приложения на стеке технологий JPA, Spring, Spring-MVC, " +
                        "GWT, ExtGWT (GXT), Commet, HTML5, Highstock для алгоритмического трейдинга.",
                "Создание JavaEE фреймворка для отказоустойчивого взаимодействия слабо-связанных сервисов " +
                        "(SOA-base архитектура, JAX-WS, JMS, AS Glassfish). Сбор статистики сервисов и информации о " +
                        "состоянии через систему мониторинга Nagios. Реализация онлайн клиента для администрирования " +
                        "и мониторинга системы по JMX (Jython/ Django)",
                "Реализация протоколов по приему платежей всех основных платежных системы России (Cyberplat, Eport, " +
                        "Chronopay, Сбербанк), Белоруcсии(Erip, Osmp) и Никарагуа.");
        ListSection qualification = new ListSection("JEE AS: GlassFish (v2.1, v3), OC4J, JBoss, Tomcat, Jetty, " +
                "WebLogic, WSO2",
                "Version control: Subversion, Git, Mercury, ClearCase, Perforce",
                "DB: PostgreSQL(наследование, pgplsql, PL/Python), Redis (Jedis), H2, Oracle, MySQL, SQLite, MS SQL, HSQLDB",
                "Languages: Java, Scala, Python/Jython/PL-Python, JavaScript, Groovy",
                "XML/XSD/XSLT, SQL, C/C++, Unix shell scripts",
                "Java Frameworks: Java 8 (Time API, Streams), Guava, Java Executor, MyBatis, Spring (MVC, Security, " +
                        "Data, Clouds, Boot), JPA (Hibernate, EclipseLink), Guice, GWT(SmartGWT, ExtGWT/GXT), Vaadin, " +
                        "Jasperreports, Apache Commons, Eclipse SWT, JUnit, Selenium (htmlelements).",
                "Python: Django.", "JavaScript: jQuery, ExtJS, Bootstrap.js, underscore.js",
                "Scala: SBT, Play2, Specs2, Anorm, Spray, Akka",
                "Технологии: Servlet, JSP/JSTL, JAX-WS, REST, EJB, RMI, JMS, JavaMail, JAXB, StAX, SAX, DOM, XSLT, MDB," +
                        " JMX, JDBC, JPA, JNDI, JAAS, SOAP, AJAX, Commet, HTML5, ESB, CMIS, BPMN2, LDAP, OAuth1, OAuth2," +
                        " JWT.", "Инструменты: Maven + plugin development, Gradle, настройка Ngnix",
                "администрирование Hudson/Jenkins, Ant + custom task, SoapUI, JPublisher, Flyway, Nagios, iReport, " +
                        "OpenCmis, Bonita, pgBouncer", "Отличное знание и опыт применения концепций ООП, SOA, шаблонов " +
                "проектрирования, архитектурных шаблонов, UML, функционального программирования", "Родной русский, " +
                "английский \"upper intermediate");

//      experience at companies
        Period experience1 = new Period(2013, Month.OCTOBER,1, "Автор проекта.", "Создание, " +
                "организация и проведение Java онлайн проектов и стажировок.");
        Company Exp1 = new Company("Java Online Projects", "link", Collections.singletonList(experience1));

        Period experience2 = new Period(2014, Month.OCTOBER, 1,2016, Month.JANUARY,1,
                "Старший разработчик (backend)", "Проектирование и разработка " +
                "онлайн платформы управления проектами Wrike (Java 8 API, Maven, Spring, MyBatis, Guava, Vaadin, " +
                "PostgreSQL, Redis). Двухфакторная аутентификация, авторизация по OAuth1, OAuth2, JWT SSO.");
        Company Exp2 = new Company("Wrike", "link", Collections.singletonList(experience2));

        Period experience3 = new Period(2012, Month.APRIL, 1,2014, Month.OCTOBER,1,
                "Java архитектор", "Организация процесса " +
                "разработки системы ERP для разных окружений: релизная политика, версионирование, ведение CI (Jenkins)," +
                " миграция базы (кастомизация Flyway), конфигурирование системы (pgBoucer, Nginx), AAA via SSO. " +
                "Архитектура БД и серверной части системы. Разработка интергационных сервисов: CMIS, BPMN2, 1C " +
                "(WebServices), сервисов общего назначения (почта, экспорт в pdf, doc, html). Интеграция Alfresco JLAN " +
                "для online редактирование из браузера документов MS Office. Maven + plugin development, Ant, Apache " +
                "Commons, Spring security, Spring MVC, Tomcat,WSO2, xcmis, OpenCmis, Bonita, Python scripting, Unix " +
                "shell remote scripting via ssh tunnels, PL/Python");
        Company Exp3 = new Company("RIT Center", "link", Collections.singletonList(experience3));

        Period experience4 = new Period(2010, Month.DECEMBER,1, 2012, Month.APRIL,1,
                "Ведущий программист", "Участие в проекте Deutsche " +
                "Bank CRM (WebLogic, Hibernate, Spring, Spring MVC, SmartGWT, GWT, Jasper, Oracle). Реализация" +
                " клиентской и серверной части CRM. Реализация RIA-приложения для администрирования, мониторинга и" +
                " анализа результатов в области алгоритмического трейдинга. JPA, Spring, Spring-MVC, GWT, ExtGWT (GXT), " +
                "Highstock, Commet, HTML5.");
        Company Exp4 = new Company("Luxoft (Deutsche Bank)", "link", Collections.singletonList(experience4));

        Period experience5 = new Period(2018, Month.JUNE,1, 2010, Month.DECEMBER,1,
                "Ведущий программист", "Дизайн и имплементация " +
                "Java EE фреймворка для отдела \"Платежные Системы\" (GlassFish v2.1, v3, OC4J, EJB3, JAX-WS RI 2.1, " +
                "Servlet 2.4, JSP, JMX, JMS, Maven2). Реализация администрирования, статистики и мониторинга фреймворка. " +
                "Разработка online JMX клиента (Python/ Jython, Django, ExtJS)");
        Company Exp5 = new Company("Yota", "link", Collections.singletonList(experience5));

        Period experience6 = new Period(2007, Month.MARCH, 2008,1, Month.JUNE,1,
                "Разработчик ПО", "Реализация клиентской " +
                "(Eclipse RCP) и серверной (JBoss 4.2, Hibernate 3.0, Tomcat, JMS) частей кластерного J2EE приложения" +
                " (OLAP, Data mining).");
        Company Exp6 = new Company("Enkata", "link", Collections.singletonList(experience6));

        Period experience7 = new Period(2005, Month.JANUARY,1, 2007, Month.FEBRUARY,1,
                "Разработчик ПО", "Разработка информационной " +
                "модели, проектирование интерфейсов, реализация и отладка ПО на мобильной IN платформе Siemens @vantage " +
                "(Java, Unix).");
        Company Exp7 = new Company("Siemens AG", "link", Collections.singletonList(experience7));

        Period experience8 = new Period(1997, Month.SEPTEMBER, 1,2005, Month.JANUARY,1,
                "Инженер по аппаратному и программному тестированию", "Тестирование, отладка, " +
                "внедрение ПО цифровой телефонной станции Alcatel 1000 S12 (CHILL, ASM).");
        Company Exp8 = new Company("Alcatel", "link", Collections.singletonList(experience8));

        CompanySection companiesExp = new CompanySection(Exp1, Exp2, Exp3, Exp4, Exp5, Exp6, Exp7, Exp8);

//      education at institutions
        Period education1 = new Period(2013, Month.MARCH,1, 2013, Month.MAY,1,
                "'Functional Programming P" + "principles in Scala' by Martin Odersky");
        Company Educ1 = new Company("Coursera", "link", Collections.singletonList(education1));

        Period education2 = new Period(2011, Month.MARCH, 1,2011, Month.APRIL,1,
                "Курс 'Объектно-ориентированный " + "анализ ИС. Концептуальное моделирование на UML.");
        Company Educ2 = new Company("Luxoft", "link", Collections.singletonList(education2));

        Period education3 = new Period(2005, Month.JANUARY, 1,2005, Month.APRIL,1,
                "3 месяца обучения мобильным " + "IN сетям (Берлин)");
        Company Educ3 = new Company("Siemens AG", "link", Collections.singletonList(education3));

        Period education4 = new Period(1997, Month.SEPTEMBER, 1,1998, Month.MARCH,1,
                "6 месяцев обучения цифровым " + "телефонным сетям (Москва)");
        Company Educ4 = new Company("Alcatel", "link", Collections.singletonList(education4));

        Period education6_1 = new Period(1993, Month.SEPTEMBER, 1,1996, Month.JULY,1,
                "Аспирантура " + "(программист С, С++)");

        Period education6_2 = new Period(1987, Month.SEPTEMBER, 1,1993, Month.JULY,1,
                "Инженер (программист Fortran, C)");
        Company Educ5 = new Company("Санкт-Петербургский национальный исследовательский университет информационных" +
                " технологий, механики и оптики", "link", Arrays.asList(education6_1, education6_2));

        Period education7 = new Period(1984, Month.SEPTEMBER, 1,1987, Month.JUNE,1,
                "Закончил с отличием");
        Company Educ6 = new Company("Заочная физико-техническая школа при МФТИ", "link",
                Collections.singletonList(education7));

        CompanySection companiesEduc = new CompanySection(Educ1, Educ2, Educ3, Educ4, Educ5, Educ6);

        Map<SectionType, Section> sections = new HashMap<>();
        sections.put(OBJECTIVE, objective);
        sections.put(PERSONAL, personal);
        sections.put(ACHIEVEMENT, achievement);
        sections.put(QUALIFICATIONS, qualification);
        sections.put(EXPERIENCE, companiesExp);
        sections.put(EDUCATION, companiesEduc);

        Map<ContactType, String> contacts = new HashMap<>();
        contacts.put(PHONE, "+7(921) 855-0482");
        contacts.put(SKYPE, "skype:grigory.kislin");
        contacts.put(MAIL, "gkislin@yandex.ru");
        contacts.put(LINKEDIN, "Reference");
        contacts.put(GITHUB, "Reference");
        contacts.put(STACKOVERFLOW, "Reference");
        contacts.put(HOMEPAGE, "Reference");

        Resume resume = new Resume("1", "Григорий Кислин", sections, contacts);







        System.out.println("                          " + resume.getFullName() + "\n");
        printContacts(contacts);
        System.out.println();
        printSections(sections);
    }

    static <V, K> void printContacts(Map<K, V> T) {
        for (Map.Entry<K, V> entry : T.entrySet()) {
            System.out.print(entry.getKey() + " - " + entry.getValue() + "\n");
        }
    }

    static <V, K> void printSections(Map<K, V> T) {
        for (Map.Entry<K, V> entry : T.entrySet()) {
            System.out.print(entry.getKey() + "\n");
            System.out.print(entry.getValue());
        }
    }

    public static Resume fillAllResumeFields(String uuid, String fullName) {

        //      objective
        TextSection objective = new TextSection("Ведущий стажировок и корпоративного обучения по Java Web и " +
                "Enterprise технологиям");

        //      personal
        TextSection personal = new TextSection("Аналитический склад ума, сильная логика, креативность, инициативность." +
                " Пурист кода и архитектуры.");

        //        achievement
        ListSection achievement = new ListSection("Реализация двухфакторной аутентификации для онлайн платформы " +
                "управления проектами Wrike. Интеграция с Twilio, DuoSecurity, Google Authenticator, Jira, Zendesk.",
                "Реализация двухфакторной аутентификации для онлайн платформы управления проектами Wrike. Интеграция с " +
                        "Twilio, DuoSecurity, Google Authenticator, Jira, Zendesk.");

        //        qualification
        ListSection qualification = new ListSection("Version control: Subversion, Git, Mercury, ClearCase, Perforce",
                "DB: PostgreSQL(наследование, pgplsql, PL/Python), Redis (Jedis), H2, Oracle, MySQL, SQLite, MS SQL, HSQLDB",
                "Languages: Java, Scala, Python/Jython/PL-Python, JavaScript, Groovy",
                "XML/XSD/XSLT, SQL, C/C++, Unix shell scripts");

        //      experience at companies
        Period experience1 = new Period(2013, Month.OCTOBER,1,
                "Автор проекта.", "Создание, организация и проведение Java онлайн проектов и стажировок.");
        Period experience2 = new Period(2022, Month.SEPTEMBER,5,
                "Engineer of fire development","Отдел противопожарной автоматики и инженерно-технических средств охраны");
        Company Exp1 = new Company("JavaOPS", "https://javaops.ru/reg/basejava", Collections.singletonList(experience1));
        Company Exp2 = new Company("КНПЗ", "https://rnknpz.rosneft.ru", Collections.singletonList(experience2));
        CompanySection companiesExp = new CompanySection(Exp1,Exp2);


        //      education at institutions
        Period education6_1 = new Period(1993, Month.SEPTEMBER,1, "Аспирантура "
                + "(программист С, С++)", "Обучение и получение новых навыков");
        Period education6_2 = new Period(1987, Month.SEPTEMBER, 1,1993, Month.JULY,1,
                "Инженер (программист Fortran, C)", "Обучение и получение новых навыков");
        Period education3 = new Period(2022, Month.SEPTEMBER,5,
                "Java Developer ","Изучение курса Base Java");
        Company Educ1 = new Company("JavaOPS", "https://javaops.ru/reg/basejava", Collections.singletonList(education3));

        Company Educ5 = new Company("Санкт-Петербургский национальный исследовательский университет информационных" +
                " технологий, механики и оптики","", Arrays.asList(education6_1, education6_2));

        CompanySection companiesEduc = new CompanySection(Educ5,Educ1);

        Map<SectionType, Section> sections = new HashMap<>();
        sections.put(OBJECTIVE, objective);
        sections.put(PERSONAL, personal);
        sections.put(ACHIEVEMENT, achievement);
        sections.put(QUALIFICATIONS, qualification);
        sections.put(EXPERIENCE, companiesExp);
        sections.put(EDUCATION, companiesEduc);

        Map<ContactType, String> contacts = new HashMap<>();
        contacts.put(PHONE, "+7(921) 855-0482");
        contacts.put(SKYPE, "skype:grigory.kislin");
        contacts.put(MAIL, "gkislin@yandex.ru");
        contacts.put(LINKEDIN, "@linkTo_me");
        contacts.put(GITHUB, "$git_hub");
        contacts.put(STACKOVERFLOW, "http/enterToUs");
        contacts.put(HOMEPAGE, "MyHtmlPage");

        return new Resume(uuid, fullName,sections, contacts);
    }
}
