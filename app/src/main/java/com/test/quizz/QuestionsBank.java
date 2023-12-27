package com.test.quizz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List <QuestionsList> englishQuestions () {
        final List <QuestionsList> questionsList = new ArrayList<>();

        final  QuestionsList question1 = new QuestionsList("PIN is used instead of a customer signature in many cases to _______ payments.",
                "confirm", "perform", "verify", "make",
                "verify", "");

        final  QuestionsList question2 = new QuestionsList("A structured set of data held in a computer, especially one that is accessible in various ways is ________.",
                "presentation", "report ", "record", "database",
                "database", "");

        final  QuestionsList question3 = new QuestionsList("An identifying number allocated to an individual by a bank or other organization and used for validating electronic transactions is_______.",
                "digit code", "PIN", "data", "signature",
                "PIN", "");

        final  QuestionsList question4 = new QuestionsList("With the latest technologies you can add multimedia ________________________ to your presentations.",
                "applications", "databases", "data", "attachments",
                "attachments", "");

        final  QuestionsList question5 = new QuestionsList("Banks _________ financial transactions online at high speed.",
                "download", "carry out", "perform", "do",
                "carry out", "");

        final  QuestionsList question6 = new QuestionsList("A _________ detecs light from the screen to select objects and draw pictures on the screen.",
                "track ball", "light pen", "mouse", "touchpad",
                "light pen", "");

        final  QuestionsList question7 = new QuestionsList("A long button in the bottom of a keyboard which produces a blank space.",
                "space bar", "backspace", "tab", "shift",
                "space bar", "");

        final  QuestionsList question8 = new QuestionsList("The teacher asked to turn on __________ so that students can keep the whiteboard constantly in view.",
                "webcams", "microphones", "touchpads", "tablets",
                "tablets", "");

        final  QuestionsList question9 = new QuestionsList("A ________ can store a single character such as the letter h or number 7.",
                "kilobyte", "byte", "binary digit", "bit",
                "byte", "");

        final  QuestionsList question10 = new QuestionsList("_________ are ten keys, which are palm-sized usually on the far right of the keyboard.",
                "dedicated", "numeric", "alphanumeric", "function",
                "numeric", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return  questionsList;

    }

    private static List <QuestionsList> historyQuestions () {
        final List <QuestionsList> questionsList = new ArrayList<>();

        final  QuestionsList question1 = new QuestionsList("У 1768 р. Коліївщиною було охоплено райони.",
                "Лівобережної України", "Правобережної України", "Слобідської України", "Південної України",
                "Правобережної України", "");

        final  QuestionsList question2 = new QuestionsList("«Спасибі вам і за ласкаве слово про дітей моїх “Гайдамаків”. Пустив я їх у люди, а до цієї пори ще ніхто й спасибі не сказав…»",
                "П. Куліш", "Т. Шевченко", "М. Максимович", "М. Шашкевич",
                "Т. Шевченко", "");

        final  QuestionsList question3 = new QuestionsList("Головна руська рада – це",
                "парламент Королівства Галіції і Лодомерії", "перша політична організація українців Галичини", "кооперативне об’єднання українців на Галичині", "мистецьке товариство русинів Закарпаття та Галичини",
                "перша політична організація українців Галичини", "");

        final  QuestionsList question4 = new QuestionsList("Визначте особливість економічного розвитку Наддніпрянської України 60–90-х рр. ХІХ ст.",
                "початок процесу індустріалізації", "витіснення іноземного капіталу національним", "скорочення обсягів промислового виробництва", "домінування державного сектору в промисловості",
                "початок процесу індустріалізації", "");

        final  QuestionsList question5 = new QuestionsList("Ухвалення якого Універсалу Української Центральної Ради дало поштовх до створення Генерального секретаріату?",
                "Першого", "Другого", "Третього", "Четвертого",
                "Першого", "");

        final  QuestionsList question6 = new QuestionsList("Що стало однією із причин проведення операції «Вісла»?",
                "активна діяльність підпілля ОУН і загонів УПА на Закерзонні", "прагнення радянського керівництва приєднати Закарпаття до УРСР", "переселення в західні області УРСР фахівців із Наддніпрянщини", "намагання забезпечити робочою силою відбудову Донбасу",
                "активна діяльність підпілля ОУН і загонів УПА на Закерзонні", "");

        final  QuestionsList question7 = new QuestionsList("«Його… скинули з вежі на гаки, умуровані в стіни біля морської затоки дорогою з Константинополя до Галати. Зачепившись ребром за гак, жив у такому стані три дні, поки турки не вбили його з лука за те, що ганив їхню віру…» Про кого з гетьманів ідеться?",
                "Дмитра (Байду) Вишневецького", "Тараса Федоровича (Трясила)", "Богдана Хмельницького", "Петра Дорошенка",
                "Дмитра (Байду) Вишневецького", "");

        final  QuestionsList question8 = new QuestionsList("Богдана Хмельницького та Iвана Мазепу об’єднують укладення воєнних договорів",
                "з Кримським ханством", "з Османською імперією", "зі Шведським королівством", "з Молдавським князівством",
                "зі Шведським королівством", "");

        final  QuestionsList question9 = new QuestionsList("До чого вiдносився напис Трудова Червона Армiя",
                "«воєнного комунізму»", "форсованої індустріалізації", "суцільної колективізації", "«коренізації»",
                "«воєнного комунізму»", "");

        final  QuestionsList question10 = new QuestionsList("«Галицько-Буковинське генерал-губернаторство» – це адміністративно-територіальна одиниця, створена",
                "владою Австро-Угорщини на початку Першої світової війни на вимогу Головної української ради та Союзу визволення України", "урядом Російської імперії для управління землями Австро-Угорщини, окупованими російською армією під час Першої світової війни", "командуванням Німеччини й Австро-Угорщини, оборону якої в роки Першої світової війни було покладено на Українських січових стрільців", "урядом Німеччини на українських землях Австро-Угорської та Російської імперій після завершення Першої світової війни",
                "урядом Російської імперії для управління землями Австро-Угорщини, окупованими російською армією під час Першої світової війни", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return  questionsList;

    }

    private static List <QuestionsList> matchQuestions () {
        final List <QuestionsList> questionsList = new ArrayList<>();

        final  QuestionsList question1 = new QuestionsList("2(5x + 6)=",
                "5x + 8", "10x + 6", "7x + 8", "10x + 12",
                "10x + 12", "");

        final  QuestionsList question2 = new QuestionsList("Точки A і B лежать на колі радіуса 16. Укажіть найбільше можливе значення довжини відрізка A B",
                "4", "8", "16", "32",
                "32", "");

        final  QuestionsList question3 = new QuestionsList("Розв’яжіть нерівність  x + 3 <= 0",
                "[0;3]", "(-∞; 3]", "(-∞; -3]", "(3;+∞]",
                "(-∞; -3]", "");

        final  QuestionsList question4 = new QuestionsList("Плату за користування комп’ютерною програмою підвищили зі 140 грн у 2021 р. до 161 грн у 2022 р. На скільки відсотків збільшили плату у 2022 р. порівняно із 2021 р.?",
                "10", "15", "21", "85",
                "15", "");

        final  QuestionsList question5 = new QuestionsList("Доберіть закінчення речення так, щоб утворилося правильне твердження: «Циліндр утворений обертанням…",
                "квадрата навколо його сторони»", "прямокутника навколо його діагоналі»", "прямокутного трикутника навколо його гіпотенузи»", "прямокутного трикутника навколо його катета»",
                "квадрата навколо його сторони»", "");

        final  QuestionsList question6 = new QuestionsList("Які з наведених тверджень є правильними? I.   Середня лінія трапеції проходить через точку перетину її діагоналей. II.  Діагональ трапеції ділить її на два рівних трикутники. III. Діагоналі рівнобічної трапеції рівні.",
                "лише III", "лише I та IIІ", "лише I та II", "лише II та IIІ",
                "лише III", "");

        final  QuestionsList question7 = new QuestionsList("Число 27 є членом арифметичної прогресії з різницею d = 5 Визначте числа з проміжку (60;75) що є членами цієї прогресії. У відповіді запишіть суму цих чисел.",
                "320", "210", "201", "67",
                "201", "");

        final  QuestionsList question8 = new QuestionsList("Остача вiд дiлення натурального числа k на 5 дорiвнює 2. Укажiть остачу вiд дiлення на 5 числа k + 21.",
                "0", "1", "2", "3",
                "3", "");

        final  QuestionsList question9 = new QuestionsList("У супермаркеті акція: купуєш три однакові шоколадки «Спокуса», а таку ж саму четверту супермаркет надає безкоштовно. Ціна кожної такої шоколадки – 35 грн. У покупця є 220грн. Яку максимальну кількість шоколадок «Спокуса» він зможе отримати, узявши участь в акції?",
                "5", "6", "7", "8",
                "8", "");

        final  QuestionsList question10 = new QuestionsList("Визначте кількість граней трикутної призми.",
                "3", "4", "5", "6",
                "5", "");

        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return  questionsList;

    }

    private static List <QuestionsList> movaQuestions () {
        final List <QuestionsList> questionsList = new ArrayList<>();

        final  QuestionsList question1 = new QuestionsList("Однаковий звук позначають букви, виділені в окремих словах речення",
                "Край, воКзал, заКріплення", "Зіщулитись, проСьба, Зябра", "усміШці, смієШся, посміШка", "несеТься, Тюльпан, Тьмяно",
                "Зіщулитись, проСьба, Зябра", "");

        final  QuestionsList question2 = new QuestionsList("Подвоєні букви -нн- треба писати на місці пропуску в усіх словах рядка",
                "моното..ий, бездога..ий, ешело..ий", "журавли..ий, страше..ий, студе..ий", "свяще..ий, довгожда..ий, безіме..ий", "скля..ий, електро..ий, благослове..ий",
                "моното..ий, бездога..ий, ешело..ий", "");

        final  QuestionsList question3 = new QuestionsList("Апостроф треба писати на місці пропуску в усіх словах рядка",
                "відв..язати, дзв..якати, Рейк..явік", "«кон..юнктура, М..юнхен, з..явитися»", "б..юро, пан..європейський, подвір..я", "верф..ю, возз..єднання, ін..єкція",
                "верф..ю, возз..єднання, ін..єкція", "");

        final  QuestionsList question4 = new QuestionsList("НЕ ДОТРИМАНО правил уживання великої букви в рядку",
                "Коліївщина, Верховна Рада України, трипільська культура", "сузір’я Великий Віз, країни Близького Сходу, бог Перун", "хрестові походи, Ріо-де-Жанейро, Олімпійські Ігри", "доба неоліту, Андріївський узвіз, День будівельника",
                "хрестові походи, Ріо-де-Жанейро, Олімпійські Ігри", "");

        final  QuestionsList question5 = new QuestionsList("НЕ МАЮТЬ закінчення обидва слова в рядку",
                "гордість, вчасно", "метро, джунглі", "читаючи, кашне", "розбито, блакить",
                "читаючи, кашне", "");

        final  QuestionsList question6 = new QuestionsList("Лексичну помилку допущено в словосполученні",
                "переказати кошти", "чинне законодавство", "співставити факти", "завдати збитків",
                "співставити факти", "");

        final  QuestionsList question7 = new QuestionsList("Українським відповідником до іншомовного слова модерний є",
                "сучасний", "незвичний", "важливий", "граничний",
                "сучасний", "");

        final  QuestionsList question8 = new QuestionsList("Лексична помилка є в реченні",
                "Досвідчені наставники сприяють професійному становленню молодих спеціалістів", "Обираючи спеціальність, ураховуйте потреби сучасного суспільства", "Надзвичайно важливим чинником у виборі фаху є також мотивація", "Беріть участь у різноманітних тренінгах з професіональної орієнтації",
                "Беріть участь у різноманітних тренінгах з професіональної орієнтації", "");

        final  QuestionsList question9 = new QuestionsList("Дорогий _______, гостинні грузини запрошують тебе відвідати _______ Батумі й покуштувати _______ хачапурі по-аджарськи.",
                "українцю, старовинний, смачний", "українець, старовинні, смачне", "українець, старовинне, смачний", "українцю, старовинне, смачне",
                "українцю, старовинне, смачне", "");

        final  QuestionsList question10 = new QuestionsList("Однакова кількість звуків і букв у кожному слові рядка",
                "п'ятниць, їстоньки, яблунька", "якість, кукурудза, український", "гайок, об'єднування, сьогодення", "серйозний, щебечуть, джміль",
                "п'ятниць, їстоньки, яблунька", "");


        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);

        return  questionsList;

    }

    public static List <QuestionsList> getQuestions (String selectedTopicName) {
        switch (selectedTopicName) {
            case "Історія" : return historyQuestions();
            case "Англійська мова" : return englishQuestions();
            case "Математика" : return matchQuestions();
            default: return movaQuestions();

        }

    }

}
