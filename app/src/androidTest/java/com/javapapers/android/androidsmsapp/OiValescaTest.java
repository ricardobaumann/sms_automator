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
    protected String getSignoutMessage() {
        return "VALESCA: Seu cancelamento foi efetuado com sucesso. Voce " +
                "pode assinar novamente a qualquer momento enviando VP para " +
                "5071";
    }

    @Override
    protected String getAlreadySignedMessage() {
        return "VALESCA: Voce ja e assinante e recebera diariamente dicas" +
                "sobre o mundo pop! Duvidas envie AJUDA";
    }

    @Override
    protected String getSecondWelcomeMessage() {
        return "Pop com Valesca Popozuda assinado! (RS3,99 por semana). Voce " +
                "recebera dicas diarias sobre o mundo Pop. Para cancelar envie " +
                "SAIR para 5071";
    }

    @Override
    protected String getFirstWelcomeMessage() {
        return "Aproveite! Voce assinou o Pop com Valesca Popozuda e os 7 " +
                "primeiros dias sao GRATIS! Não";
    }

    @Override
    protected String getOptinKeyword() {
        return "vp";
    }

    @Override
    protected String getLA() {
        return "5071";
    }
}
