<!DOCTYPE html>
<html lang="pt-br">
<head>
 <meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>CRUD com Bootstrap 3</title>

 <link href="resources/css/bootstrap.min.css" rel="stylesheet">
 <link href="resources/css/styleNovo.css" rel="stylesheet">
</head>
<body>
 <div id="main" class="container-fluid"> 
  <form action="index.html">
    <div class="row">
      <div class="form-group col-md-4">
        <label for="exampleInputEmail1">Nome</label>
        <input type="text" class="form-control" id="nome" placeholder="Digite o valor">
      </div>
    <div class="form-group col-md-4">
        <label for="exampleInputEmail1">Nome da mae</label>
        <input type="text" class="form-control" id="nome_mae" placeholder="Digite o valor">
      </div>
    <div class="form-group col-md-4">
        <label for="exampleInputEmail1">CPF</label>
        <input type="text" class="form-control" id="cpf" placeholder="Digite o valor">
      </div>
  </div>
  
  <div class="row">
      <div class="form-group col-md-3">
        <label for="exampleInputEmail1">RG</label>
        <input type="text" class="form-control" id="rg" placeholder="Digite o valor">
      </div>
    <div class="form-group col-md-3">
        <label for="exampleInputEmail1">Naturalidade</label>
        <input type="text" class="form-control" id="naturalidade" placeholder="Digite o valor">
      </div>
    <div class="form-group col-md-3">
        <label for="exampleInputEmail1">Endereco</label>
        <input type="text" class="form-control" id="endereco" placeholder="Digite o valor">
      </div>
    <div class="form-group col-md-3">
        <label for="exampleInputEmail1">Telefone</label>
        <input type="text" class="form-control" id="telefone" placeholder="Digite o valor">
      </div>
  </div>
  
  <div class="row">
      <div class="form-group col-md-6">
        <label for="exampleInputEmail1">Email</label>
        <input type="email" class="form-control" id="email" placeholder="Digite o valor">
      </div>
    <div class="form-group col-md-6">
        <label for="exampleInputEmail1">Senha</label>
        <input type="password" class="form-control" id="senha" placeholder="Digite o valor">
      </div>
  </div>
  
  <div class="row">
      <div class="form-group col-md-3">
        <label for="exampleInputEmail1">Nome do curso</label>
        <input type="text" class="form-control" id="curso" placeholder="Digite o valor">
      </div>
    <div class="form-group col-md-3">
        <label for="exampleInputEmail1">Ano de ingresso</label>
        <input type="number" class="form-control" id="ano_ingresso" placeholder="Digite o valor">
      </div>
    <div class="form-group col-md-3">
        <label for="exampleInputEmail1">Periodo de ingresso</label>
        <input type="number" class="form-control" id="p_ingresso" placeholder="Digite o valor">
      </div>
  </div>
  <hr />
  
  <div class="row">
    <div class="col-md-12">
      <button type="submit" class="btn btn-primary">Salvar</button>
    <a href="template.html" class="btn btn-default">Cancelar</a>
    </div>
  </div>

  </form>
 </div>
 
 <script src="resources/js/jquery.min.js"></script>
 <script src="resources/js/bootstrap.min.js"></script>
</body>
</html>