O desafio consiste em desenvolver uma aplicação Java para o controle de uma conta bancária virtual. O objetivo principal é consolidar seus conhecimentos em lógica de programação utilizando variáveis para os dados da conta, condicionais para gerenciar as operações e o fluxo do programa, além de estruturas de repetição para manter o menu ativo.

Para começar, sugiro que você siga este passo a passo, focando em construir o projeto de forma modular:

Primeiro, defina as variáveis necessárias para armazenar os dados do cliente, como o nome, o tipo de conta (ex: corrente) e o saldo inicial. Comece imprimindo essas informações na tela para garantir que sua base está correta.

Em seguida, implemente a estrutura do menu de opções utilizando uma estrutura de repetição, como o while. O objetivo aqui é fazer com que as quatro opções (1-Consultar, 2-Receber, 3-Transferir, 4-Sair) apareçam repetidamente e que o programa encerre apenas quando o usuário selecionar a opção de saída.

Depois, foque na primeira operação, que é a visualização do saldo. Como você já tem a variável do saldo definida no início, basta exibir o valor atual dentro da condicional que verifica se o usuário digitou 1.

Quarto, desenvolva a lógica para receber valores. Você precisará ler uma entrada do usuário, somar esse valor ao seu saldo atual e exibir o novo total. Lembre-se de testar essa etapa isoladamente antes de prosseguir.

Por fim, crie a lógica para a transferência. Aqui é onde você deve aplicar a verificação que discutimos anteriormente: comparar o valor que o usuário deseja retirar com o saldo disponível. Se o valor for maior que o saldo, você deve apresentar a mensagem de erro; caso contrário, deve subtrair o valor do saldo e atualizar o sistema.

Uma dica importante: execute o código a cada nova funcionalidade adicionada. Se você implementar o menu e o depósito, teste-os várias vezes antes de tentar codificar a transferência. Isso ajuda muito a encontrar erros rapidamente.
