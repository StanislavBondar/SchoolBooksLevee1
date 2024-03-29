package com.aleksandrp.schoolbooksleeveel1.db.constants;

import com.aleksandrp.schoolbooksleeveel1.R;

/**
 * Created by Aleksandr on 25.09.2015.
 */
public interface ValuesDB {


    String TAG_DB = "My_Db";

    String NAME_DB = "level_1";

    int VERSION_DB = 1;
    String TABLE_BOOKS_LEVEL_1 = "school_books_level_1";
    String TABLE_GDZ_LEVEL_1 = "gdz_level_1";

    String COLUMN_NAME_BOOK = "name_book";
    String COLUMN_SMALL_ICON = "small_icon_book";
    String COLUMN_ICON_STATUS = "icon_status_loader";
    String COLUMN_LINK_LOADER = "link_download";
    String COLUMN_ITEM = "item";

    String CREATE_TABLE_BOOK = "CREATE TABLE IF NOT EXISTS " +
            TABLE_BOOKS_LEVEL_1 + " (\n" +
            COLUMN_NAME_BOOK + "          TEXT    NOT NULL, \n" +
            COLUMN_SMALL_ICON + "    INTEGER DEFAULT (0), \n" +
            COLUMN_ICON_STATUS + " TEXT    NOT NULL\n" +
            "                               DEFAULT ('0'), \n" +
            COLUMN_LINK_LOADER + "      TEXT    NOT NULL, \n" +
            COLUMN_ITEM + " INTEGER NOT NULL);";

    String CREATE_TABLE_GDZ = "CREATE TABLE IF NOT EXISTS " +
            TABLE_GDZ_LEVEL_1 + " (\n" +
            COLUMN_NAME_BOOK + "          TEXT    NOT NULL, \n" +
            COLUMN_SMALL_ICON + "    INTEGER DEFAULT (0), \n" +
            COLUMN_ICON_STATUS + " TEXT NOT NULL\n" +
            "                               DEFAULT ('0'), \n" +
            COLUMN_LINK_LOADER + "      TEXT    NOT NULL, \n" +
            COLUMN_ITEM + " INTEGER NOT NULL);";

    String BASE_START_QUERY = "INSERT INTO school_books_level_1 (" + COLUMN_NAME_BOOK + ", " + COLUMN_SMALL_ICON + ", " + COLUMN_LINK_LOADER + ", " + COLUMN_ITEM + ") VALUES ";
    String BASE_END_QUERY = ";";
//    String Insert = "INSERT INTO school_books_level_1 (" + COLUMN_NAME_BOOK + ", " + COLUMN_SMALL_ICON + ", " + COLUMN_LINK_LOADER + ", " + COLUMN_ITEM + ") VALUES \n" +
//            "        ('Англійська мова (Калініна, Самойлюкевич) 1 клас', " + R.drawable.anglkalinina + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyRWpONkJaSWx3Q1E', 1),\n" +
//            "        ('Англійська мова (Карп’юк) 1 клас', " + R.drawable.anglkarpuk + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyV2RweElaRHhwUUE', 1),\n" +
//            "        ('Англійська мова (Несвіт) 1 клас', " + R.drawable.anglnesvit + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyZmhLNXM2R3FFeXM', 1),\n" +
//            "        ('Англійська мова (Ростоцька, Карп’юк) 1 клас', " + R.drawable.anglrostockaja + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiydXdiTW1HZklpbkU', 1),\n" +
//            "        ('Англійська мова Зошит для письма (Вітушинська, Косован) 1 клас', " + R.drawable.anglzoshvitushunskaja + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyRnZMa2dScmZ4MEE', 1),\n" +
//            "        ('Англійська мова Робочий зошит (Карп’юк) 1 клас', " + R.drawable.anglzoshkarpuk + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyOUFPNlcySW1Telk', 1),\n" +
//            "        ('Англійська мова Робочий зошит (Несвіт) 1 клас', " + R.drawable.anglzoshnesvit + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyUEhmVFQ4Ql9icFk', 1),\n" +
//            "        ('Буквар (Вашуленко) 1 клас', " + R.drawable.bukvar_vashulenko + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyMzhJdWRrVE5tbnc', 2),\n" +
//            "        ('Буквар (Захарiйчукб Науменко) 1 клас', " + R.drawable.bukvar_zaharcuk + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyZk5hU3FaMjlwRmM', 2),\n" +
//            "        ('Математика (Богданович, Лишенко) 1 клас', " + R.drawable.matem_bogdanov + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiySE5HLU1ITlprdFk', 3),\n" +
//            "        ('Математика (Заїка, Тарнавська) 1 клас', " + R.drawable.matem_zaika + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiybG5RLXFBZ2d0cVE', 3),\n" +
//            "        ('Математика (Рівкінд, Оляницька) 1 клас', " + R.drawable.matem_rivkin + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyUjBjRVRzSEstSmM', 3),\n" +
//            "        ('Музичне мистецтво (Лобова) 1 клас', " + R.drawable.music + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyYllmX0Y3RXhCSnc', 4),\n" +
//            "        ('Німецька мова (Паршикова, Мельничук/, Савченко, Сидоренко, Горбач) 1 клас', " + R.drawable.nimec_parshukov + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyVVRtelBHVmxrd0k', 5),\n" +
//            "        ('Німецька мова (Скоропад) 1 клас', " + R.drawable.nimec_skoropad + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiycHlqU05TSXBWYlU', 5),\n" +
//            "        ('Мистецтво (Масол, Гайдамака, Очеретяна) 1 клас', " + R.drawable.mist_masol + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyOVJZX1p6cllkMms', 6),\n" +
//            "        ('Образотворче мистецтво (Калініченко, Сергієнко) 1 клас', " + R.drawable.mist_kalinichenko + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyY3RyX2ZzNDJBcnM', 6),\n" +
//            "        ('Основи здоров`я (Гнатюк) 1 клас', " + R.drawable.zdor_gnatuk + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyRjRTUmVLOXJQWEU', 7),\n" +
//            "        ('Основи здоров’я (Бех, Воронцова, Пономаренко, Страшко) 1 клас', " + R.drawable.zdorov_beh + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyTUROT1RBS291UkE', 7),\n" +
//            "        ('Природознавство (Гільберг, Сак) 1 клас', " + R.drawable.priroda_galbert + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiySVV6a3dlRGRUQzg', 8),\n" +
//            "        ('Природознавство (Грущинська) 1 клас', " + R.drawable.priroda_grushunska + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyajJLWF9RVV81NVE', 8),\n" +
//            "        ('Російська мова (Лапшина, Зорька) 1 клас', " + R.drawable.rus_lapshuna + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyMk4tZ3NRY1lzMm8', 9),\n" +
//            "        ('Російська мова (Статівка, Самонова) 1 клас', " + R.drawable.rus_stativka + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyb3BiYVd5OWEtaDg', 9),\n" +
//            "        ('Трудове навчання (Сидоренко, Котелянець) 1 клас', " + R.drawable.trud + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyaDZOSDU3RC1vdlE', 10),\n" +
//            "        ('Українська мова (Захарійчук) 1 клас', " + R.drawable.ukr_zaharcuk + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyS3drQ3ZEY1dsLVE', 11),\n" +
//            "        ('Французька мова (Клименко) 1 клас', " + R.drawable.fran_klimenko + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyVGZJR200eXdLTUE', 12),\n" +
//            "        ('Французька мова (Чумак, Кривошеєва) 1 клас', " + R.drawable.franc_cumak + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyX0FOcFJNOUZkM2c', 12);";

    String ISERT_LIST_BOOKS = "INSERT INTO school_books_level_1 (name_book, small_icon_book, icon_status_loader, link_download, item) VALUES \n" +
            "('Англійська мова (Калініна, Самойлюкевич) 1 клас',  0, 0, 'zzzzzz')," +
            "('Англійська мова (Карп’юк) 1 клас',  0, 0, 'zzzzzz')," +
            "('Англійська мова (Несвіт) 1 клас', 0, 0, 'zzzzzz')," +
            "('Англійська мова (Ростоцька, Карп’юк) 1 клас', 0, 0, 'zzzzzz')," +
            "('Англійська мова Зошит для письма (Вітушинська, Косован) 1 клас', 0, 0, 'zzzzzz')," +
            "('Англійська мова Робочий зошит (Карп’юк) 1 клас', 0, 0, 'zzzzzz')," +
            "('Англійська мова Робочий зошит (Несвіт) 1 клас', 0, 0, 'zzzzzz')," +
            "('Буквар (Вашуленко) 1 клас', 0, 0, 'zzzzzz')," +
            "('Математика (Богданович, Лишенко) 1 клас', 0, 0, 'zzzzzz')," +
            "('Математика (Рівкінд, Оляницька) 1 клас', 0, 0, 'zzzzzz')," +
            "('Музичне мистецтво (Лобова) 1 клас', 0, 0, 'zzzzzz')," +
            "('Німецька мова (Паршикова, Мельничук/, Савченко, Сидоренко, Горбач) 1 клас', 0, 0, 'zzzzzz')," +
            "('Німецька мова (Скоропад) 1 клас', 0, 0, 'zzzzzz')," +
            "('Основи здоров`я (Гнатюк) 1 клас', 0, 0, 'zzzzzz')," +
            "('Основи здоров’я (Бех, Воронцова, Пономаренко, Страшко) 1 клас', 0, 0, 'zzzzzz')," +
            "('Природознавство (Гільберг, Сак) 1 клас', 0, 0, 'zzzzzz')," +
            "('Природознавство (Грущинська) 1 клас', 0, 0, 'zzzzzz')," +
            "('Російська мова (Лапшина, Зорька) 1 клас', 0, 0, 'zzzzzz')," +
            "('Російська мова (Статівка, Самонова) 1 клас', 0, 0, 'zzzzzz')," +
            "('Українська мова (Захарійчук) 1 клас', 0, 0, 'zzzzzz')," +
            "('Французька мова (Чумак, Кривошеєва) 1 клас', 0, 0, 'zzzzzz');";


    String[] massQueryBook = {
            "('Англійська мова (Калініна, Самойлюкевич) 1 клас', " + R.drawable.anglkalinina + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyRWpONkJaSWx3Q1E', 1)",
            "('Англійська мова (Карп’юк) 1 клас', " + R.drawable.anglkarpuk + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyV2RweElaRHhwUUE', 1)",
            "('Англійська мова (Несвіт) 1 клас', " + R.drawable.anglnesvit + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyZmhLNXM2R3FFeXM', 1)",
            "('Англійська мова (Ростоцька, Карп’юк) 1 клас', " + R.drawable.anglrostockaja + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiydXdiTW1HZklpbkU', 1)",
            "('Англійська мова Зошит для письма (Вітушинська, Косован) 1 клас', " + R.drawable.anglzoshvitushunskaja + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyRnZMa2dScmZ4MEE', 1)",
            "('Англійська мова Робочий зошит (Карп’юк) 1 клас', " + R.drawable.anglzoshkarpuk + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyOUFPNlcySW1Telk', 1)",
            "('Англійська мова Робочий зошит (Несвіт) 1 клас', " + R.drawable.anglzoshnesvit + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyUEhmVFQ4Ql9icFk', 1)",
            "('Буквар (Вашуленко) 1 клас', " + R.drawable.bukvar_vashulenko + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyMzhJdWRrVE5tbnc', 2)",
            "('Буквар (Захарiйчукб Науменко) 1 клас', " + R.drawable.bukvar_zaharcuk + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyZk5hU3FaMjlwRmM', 2)",
            "('Математика (Богданович, Лишенко) 1 клас', " + R.drawable.matem_bogdanov + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiySE5HLU1ITlprdFk', 3)",
            "('Математика (Заїка, Тарнавська) 1 клас', " + R.drawable.matem_zaika + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiybG5RLXFBZ2d0cVE', 3)",
            "('Математика (Рівкінд, Оляницька) 1 клас', " + R.drawable.matem_rivkin + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyUjBjRVRzSEstSmM', 3)",
            "('Музичне мистецтво (Лобова) 1 клас', " + R.drawable.music + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyYllmX0Y3RXhCSnc', 4)",
            "('Німецька мова (Паршикова, Мельничук/, Савченко, Сидоренко, Горбач) 1 клас', " + R.drawable.nimec_parshukov + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyVVRtelBHVmxrd0k', 5)",
            "('Німецька мова (Скоропад) 1 клас', " + R.drawable.nimec_skoropad + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiycHlqU05TSXBWYlU', 5)",
            "('Мистецтво (Масол, Гайдамака, Очеретяна) 1 клас', " + R.drawable.mist_masol + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyOVJZX1p6cllkMms', 6)",
            "('Образотворче мистецтво (Калініченко, Сергієнко) 1 клас', " + R.drawable.mist_kalinichenko + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyY3RyX2ZzNDJBcnM', 6)",
            "('Основи здоров`я (Гнатюк) 1 клас', " + R.drawable.zdor_gnatuk + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyRjRTUmVLOXJQWEU', 7)",
            "('Основи здоров’я (Бех, Воронцова, Пономаренко, Страшко) 1 клас', " + R.drawable.zdorov_beh + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyTUROT1RBS291UkE', 7)",
            "('Природознавство (Гільберг, Сак) 1 клас', " + R.drawable.priroda_galbert + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiySVV6a3dlRGRUQzg', 8)",
            "('Природознавство (Грущинська) 1 клас', " + R.drawable.priroda_grushunska + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyajJLWF9RVV81NVE', 8)",
            "('Російська мова (Лапшина, Зорька) 1 клас', " + R.drawable.rus_lapshuna + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyMk4tZ3NRY1lzMm8', 9)",
            "('Російська мова (Статівка, Самонова) 1 клас', " + R.drawable.rus_stativka + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyb3BiYVd5OWEtaDg', 9)",
            "('Трудове навчання (Сидоренко, Котелянець) 1 клас', " + R.drawable.trud + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyaDZOSDU3RC1vdlE', 10)",
            "('Українська мова (Захарійчук) 1 клас', " + R.drawable.ukr_zaharcuk + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyS3drQ3ZEY1dsLVE', 11)",
            "('Французька мова (Клименко) 1 клас', " + R.drawable.fran_klimenko + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyVGZJR200eXdLTUE', 12)",
            "('Французька мова (Чумак, Кривошеєва) 1 клас', " + R.drawable.franc_cumak + ", 'https://drive.google.com/open?id=0B3SV6nfdIWiyX0FOcFJNOUZkM2c', 12)"
    };

}
