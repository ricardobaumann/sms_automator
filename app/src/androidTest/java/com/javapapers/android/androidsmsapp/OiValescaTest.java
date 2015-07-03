package com.javapapers.android.androidsmsapp;

/**
 * Created by ricardo on 03/07/15.
 */
public class OiValescaTest extends SmsTest {

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
        return "VALESCA: Seu cancelamento foi efetuado com sucesso. Voce " +
                "pode assinar novamente a qualquer momento enviando VP para " +
                "5071";
    }

    @Override
    protected String getAlreadySignedMessage() {
        return "Valesca: Voce ja eh assinante";
    }

    @Override
    protected String getWelcomeMessage() {
        return "Pop com Valesca Popozuda assinado! (RS3,99 por semana). Voce " +
                "recebera dicas diarias sobre o mundo Pop. Para cancelar envie " +
                "SAIR para 5071";
    }

    @Override
    protected String getFreePeriodMessage() {
        return null;
    }

    @Override
    protected String getOptinKeyword() {
        return "VP";
    }

    @Override
    protected String getLA() {
        return "5071";
    }
}
