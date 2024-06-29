# Prova de programação 3 Femass

Prova da matéria de programação 3 da faculdade Femass. A prova tinha como objetivo praticar os conceitos de Objetos, classes e herança.

![image](https://github.com/LeonardoMarins/Prova_prog3_p2/assets/109676300/15eea780-7e57-4357-92ca-4532667fa4f4)

O cenário da prova: Considere a Figura 1 a visão detalhada das classes que compõem o ambiente de negócio de uma
Clínica Hospitalar, que presta serviços de atendimento médico a pacientes, incluindo enfermagem para
execução de exames radiológicos. Logo, você foi contratado para o desenvolvimento de um sistema Java
com interface gráfica Desktop adequada para cadastro de Pacientes, Médicos e Enfermeiros, bem como o
registro de Consulta Médica. Eis a seguir mais detalhamentos:

- Prever construtores especializados para o cadastro de “Paciente”, “Médico” e “Enfermeiro”,
observando a classificação de dados herdada a partir de “Dado Pessoal” de cada um. Veja que todos
devem ter obrigatoriamente o cadastro de “Endereço” e “Contato de Telefone/email”. O “Médico” e o
“Enfermeiro” são atendentes do hospital, precisam ter cadastrados a CH semanal e o setor de trabalho,
além de dados previstos em suas classes específicas. Desenvolva convenientemente todas as classes
indicadas na Figura 1 e crie métodos set/get para os atributos privados gerais, bem como métodos
acessórios que se fizerem necessários.

- O cadastro de uma “Consulta Médica” envolve em identificar o “Paciente” e o “Médico” anteriormente
cadastrados. Assim, toda consulta estará vinculada à relação paciente-médico.

- As classes “Endereço”, “Contato Telefone/email” e “Responsável” são acessórias aos cadastros gerais,
bem como a classe “Gênero”, a ser construída como “enum” (Enumerator).

- Classe principal (main) .java deverá concentrar os elementos de front-end (GUI para com o usuário),
usando o GUI Designer disponível. Logo, esta tela principal deverá invocar as funcionalidades desejadas
(que poderão gerar arquivos .java de interface específicos):

I) cadastrar / consultar / editar / remover “pacientes”, “médicos” e “enfermeiros” cadastrados,
mantendo listas adequadas para cada categoria cadastrada em memória RAM (ArrayLists, p. ex.). Não
misturar as categorias no filtro de informações para tal, criando assim telas cadastrais específicas.
II) cadastrar / consultar / editar / remover “consultas médicas”, tal como no item anterior. 

# Rodando a aplicação:

**Rodando a classe main temos o menu inicial**:

![image](https://github.com/LeonardoMarins/Prova_prog3_p1/assets/109676300/06f9b4d8-dcdf-40da-81cb-ff196d17a90f)

* Na primeira seção, temos os cadastros básicos, ou seja, os dados cadastrados são usados no cadastro específico.

=> **Cadastro de endereço**:
  
![image](https://github.com/LeonardoMarins/Prova_prog3_p1/assets/109676300/926b962e-1a31-4902-9eb1-9f137e2d0ddd)

=> **Listagem de endereços**:
  
![image](https://github.com/LeonardoMarins/Prova_prog3_p1/assets/109676300/de3da49e-0415-4f03-865b-8c04bbeff646)

* Na segunda seção, temos os cadastros específico, ou seja, são os cadastros de medicos, paciente, enfermeiro e consultas e são usados para exportar em excel.

=> **Cadastro de paciente**:

![image](https://github.com/LeonardoMarins/Prova_prog3_p1/assets/109676300/ee1531bd-6ac1-406c-a63f-ce074810d41b)

=> **Listagem de paciente**:

![image](https://github.com/LeonardoMarins/Prova_prog3_p1/assets/109676300/bfc906bc-701e-4bae-8d6d-d1ba93ee81af)

* **Exportando para excel**:

![image](https://github.com/LeonardoMarins/Prova_prog3_p1/assets/109676300/52ea72dd-f526-42be-8dc9-2d1e6563190e)

![image](https://github.com/LeonardoMarins/Prova_prog3_p1/assets/109676300/5a1552fe-7f8d-4fb7-9099-96b6d0fa8c89)

![image](https://github.com/LeonardoMarins/Prova_prog3_p1/assets/109676300/4fd4af28-c6ab-47af-ac96-349c77fc7d64)


