
package br.com.conversorDeMoedas.main;

import br.com.conversorDeMoedas.models.Coin;
import br.com.conversorDeMoedas.models.QueryCoin;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    Locale locale = new Locale("pt-br");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueryCoin queryCoin = new QueryCoin();
        int choice = 0;
        double priceInUsd = 0.0;
        double priceInArs = 0.0;
        double priceInCop = 0.0;
        double priceInBrl = 0.0;
        double convertedValue = 0.0;
        double conversionRates = 0.0;
        String fromCurrency1 = "USD";
        String fromCurrency2 = "ARS";
        String fromCurrency3 = "COP";
        String fromCurrency4 = "BRL";


        while (choice != 5) {
            System.out.println("***********************************************");
            System.out.println("Seja bem-vindo(a) ao Conversor de Moedas \n");
            System.out.println("Escolha uma das seguintes moedas para converter:");
            System.out.println("1 - Converter Dollar Americano para outras moedas");
            System.out.println("2 - Converter Peso Argentino para outras moedas");
            System.out.println("3 - Converter Peso Colombiano para outras moedas");
            System.out.println("4 - Converter Real Brasileiro para outras moedas");
            System.out.println("5 - Sair");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("***************************");
                    System.out.println("Converter a partir do Dollar Americano:");
                    System.out.println("1 - Dollar -> Peso Argentino");
                    System.out.println("2 - Dollar -> Peso Colombiano");
                    System.out.println("3 - Dollar -> Real Brasileiro");
                    int choiceDollar = sc.nextInt();


                    switch (choiceDollar){
                        case 1:
                            conversionRates = queryCoin.getConversionsRate(fromCurrency1, "ARS");
                            System.out.println("Digite o valor que desja converter");
                            priceInUsd = sc.nextDouble();
                            convertedValue = priceInUsd * conversionRates;
                            System.out.println("Valor convertido: " + convertedValue + " pesos");
                            break;

                        case 2:
                            conversionRates = queryCoin.getConversionsRate(fromCurrency1, "COP");
                            System.out.println("Digite o valor que desja converter");
                            priceInUsd = sc.nextDouble();
                            convertedValue = priceInUsd * conversionRates;
                            System.out.println("Valor convertido: " + convertedValue + " pesos");
                            break;

                        case 3:
                            conversionRates = queryCoin.getConversionsRate(fromCurrency1, "BRL");
                            System.out.println("Digite o valor que desja converter");
                            priceInUsd = sc.nextDouble();
                            convertedValue = priceInUsd * conversionRates;
                            System.out.println("Valor convertido: " + convertedValue + " reais");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("***************************");
                    System.out.println("Converter a partir do Peso Argentino:");
                    System.out.println("1 - Peso Argentino -> Dollar Americano");
                    System.out.println("2 - Peso Argentino -> Peso Colombiano");
                    System.out.println("3 - Peso Argentino -> Real Brasileiro");
                    int choiceArgentinePeso = sc.nextInt();


                    switch(choiceArgentinePeso){
                        case 1:
                            conversionRates = queryCoin.getConversionsRate(fromCurrency2, "USD");
                            System.out.println("Digite o valor que desja converter");
                            priceInArs = sc.nextDouble();
                            convertedValue = priceInArs * conversionRates;
                            System.out.println("Valor convertido: " + convertedValue + " dólares");
                            break;

                        case 2:
                            conversionRates = queryCoin.getConversionsRate(fromCurrency2, "COP");
                            System.out.println("Digite o valor que desja converter");
                            priceInArs = sc.nextDouble();
                            convertedValue = priceInArs * conversionRates;
                            System.out.println("Valor convertido: " + convertedValue + " pesos");
                            break;

                        case 3:
                            conversionRates = queryCoin.getConversionsRate(fromCurrency2, "BRL");
                            System.out.println("Digite o valor que desja converter");
                            priceInArs = sc.nextDouble();
                            convertedValue = priceInArs * conversionRates;
                            System.out.println("Valor convertido: " + convertedValue + " reais");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("***************************");
                    System.out.println("Converter a partir do Peso Colombiano:");
                    System.out.println("1 - Peso Colombiano -> Dollar Americano");
                    System.out.println("2 - Peso Colombiano -> Peso Argentino");
                    System.out.println("3 - Peso Colombiano -> Real Brasileiro");
                    int choiceColombianPeso = sc.nextInt();


                    switch(choiceColombianPeso){
                        case 1:
                            conversionRates = queryCoin.getConversionsRate(fromCurrency3, "USD");
                            System.out.println("Digite o valor que desja converter");
                            priceInCop = sc.nextDouble();
                            convertedValue = priceInCop * conversionRates;
                            System.out.println("Valor convertido: " + convertedValue + " dolares");
                            break;

                        case 2:
                            conversionRates = queryCoin.getConversionsRate(fromCurrency3, "ARS");
                            System.out.println("Digite o valor que desja converter");
                            priceInCop = sc.nextDouble();
                            convertedValue = priceInCop * conversionRates;
                            System.out.println("Valor convertido: " + convertedValue + " pesos");
                            break;

                        case 3:
                            conversionRates = queryCoin.getConversionsRate(fromCurrency3, "BRL");
                            System.out.println("Digite o valor que desja converter");
                            priceInCop = sc.nextDouble();
                            convertedValue = priceInCop * conversionRates;
                            System.out.println("Valor convertido: " + convertedValue + " reais");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("***************************");
                    System.out.println("Converter a partir do Real Brasileiro:");
                    System.out.println("1 - Real Brasileiro -> Dollar Americano");
                    System.out.println("2 - Real Brasileiro -> Peso Argentino");
                    System.out.println("3 - Real Brasileiro -> Peso Colombiano");
                    int choiceBrazilianReal = sc.nextInt();


                    switch(choiceBrazilianReal){
                        case 1:
                            conversionRates = queryCoin.getConversionsRate(fromCurrency4, "USD");
                            System.out.println("Digite o valor que desja converter");
                            priceInBrl = sc.nextDouble();
                            convertedValue = priceInBrl * conversionRates;
                            System.out.println("Valor convertido: " + convertedValue + " dolares");
                            break;

                        case 2:
                            conversionRates = queryCoin.getConversionsRate(fromCurrency4, "ARS");
                            System.out.println("Digite o valor que desja converter");
                            priceInBrl = sc.nextDouble();
                            convertedValue = priceInBrl * conversionRates;
                            System.out.println("Valor convertido: " + convertedValue + " pesos");
                            break;

                        case 3:
                            conversionRates = queryCoin.getConversionsRate(fromCurrency4, "COP");
                            System.out.println("Digite o valor que desja converter");
                            priceInBrl = sc.nextDouble();
                            convertedValue = priceInBrl * conversionRates;
                            System.out.println("Valor convertido: " + convertedValue + " pesos");
                            break;
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Escolha Inválida!");
                    break;
            }

        }

    }
}