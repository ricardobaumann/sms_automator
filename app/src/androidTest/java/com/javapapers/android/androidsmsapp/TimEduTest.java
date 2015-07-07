package com.javapapers.android.androidsmsapp;

/**
 * Created by ricardo on 07/07/15.
 */
public class TimEduTest extends SmsTest {
    @Override
    protected String getOptoutKeyword() {
        return "SAIR";
    }

    @Override
    protected String getFirstContent() {
        return null;
    }

    @Override
    protected String getSignoutMessage() {
        return "Edu Guedes:Seu cancelamentofoi " +
                "realizadocomsucesso!Caso queira " +
                "assinarnovamenteenvieRCT para " +
                "5052";
    }

    @Override
    protected String getAlreadySignedMessage() {
        return "EDU GUEDES. Você ja eh assinante";
    }

    @Override
    protected String getWelcomeMessage() {
        return "Bem vindo ao TIM RECEITAS";
    }

    @Override
    protected String getFreePeriodMessage() {
        return null;
    }

    @Override
    protected String getOptinKeyword() {
        return "RCT";
    }

    @Override
    protected String getLA() {
        return "5052";
    }
}
