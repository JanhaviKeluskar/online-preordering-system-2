package com.example.onlinepreorderingsystem.Helper;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Helper
{
    public static DateTimeFormatter ddMMyyyy = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static String rsFormat(String value)
    {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        currencyFormat.setGroupingUsed(true);
        currencyFormat.setMinimumFractionDigits(2);
        currencyFormat.setMaximumFractionDigits(2);
        return currencyFormat.format(value.replace(",", ""));
    }

    public static String rsFormat(double num)
    {
        NumberFormat currencyFormat = NumberFormat.getNumberInstance();
        currencyFormat.setGroupingUsed(true);
        currencyFormat.setMinimumFractionDigits(2);
        currencyFormat.setMaximumFractionDigits(2);
        return currencyFormat.format(num);
    }
}
