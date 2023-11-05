package com.techchallenge.parquimetro.dominios.estacionamento.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class JobsMonitoramento {

        // chamar as querys  via repository ou algo no service , fazer um loop e mandar mensagens

        @Scheduled(cron = "0/5 * * * * ?")
        public void mensagemExpiracaoFixo() {
            System.out.println("TempoFixo");

        }
        @Scheduled(cron = "0/5 * * * * ?")
        public void mensagemExpiracaoVariavel(){
            System.out.println("TempoVariavel");
        }

}
