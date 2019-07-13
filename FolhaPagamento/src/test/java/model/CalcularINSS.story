Narrative:
Como gerente de RH
Desejo calcular o INSS e o salário liquido
Para elaborar a folha de pagamento

Scenario:  Calcular INSS
Given que esteja logado como gerente de RG GERRH
When quando eu inserir o salário bruto de R$ <salario>
Then o sistema retorna o INSS de R$ <inss> e o salário líquido será R$ <salarioLiquido>

|salario|inss|salarioLiquido|
|1500.00|120.00|1280.00|
|2100.00|189.00|1911.00|
|3350.00|368.50|2981.50|
|5950.00|642.33|5307.67|