package com.javapapers.android.androidsmsapp;

/**
 * Created by ricardo on 07/07/15.
 */
public class TimPaulaFernandesTest extends SmsTest {
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
        return "PAULAFERNANDES: Seu cancelamentofoi " +
                "realizadocomsucesso!Caso queiraassinar " +
                "novamenteenviePF para 6079";
    }

    @Override
    protected String getAlreadySignedMessage() {
        return "PAULAFERNANDES: Voce ja eh assinante! " +
                "Em brevereceberaviaSMS minhasmensagens " +
                "pra voce!Acesse " +
                "www.timpaulafernandes.com.brpara veras " +
                "ultimasdicas";
    }

    @Override
    protected String getWelcomeMessage() {
        return "PAULAFERNANDES: Siga minhavidade perto " +
                "em www.timpaulafernandes.com.br!Apos3 dias " +
                "gratis:RS3,99/semana.Cancelar?EnvieSAIR.";
    }

    @Override
    protected String getFreePeriodMessage() {
        return null;
    }

    @Override
    protected String getOptinKeyword() {
        return "PF";
    }

    @Override
    protected String getLA() {
        return "6079";
    }
}
