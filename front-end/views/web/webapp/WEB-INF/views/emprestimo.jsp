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
        <label for="exampleInputEmail1">Código do item</label>
        <input type="text" class="form-control" id="codigo_item" placeholder="Digite o valor">
      </div>
      <div class="form-group col-md-4">
        <label for="exampleInputEmail1">Date de emprestimo</label>
        <input type="date" class="form-control" id="data_emprestimo" placeholder="Digite o valor">
      </div>
      <div class="form-group col-md-4">
        <label for="exampleInputEmail1">Data de Devolução</label>
        <input type="date" class="form-control" id="data_devolucao" placeholder="Digite o valor">
      </div>
    </div>

    <div class="form-group col-md-4">
      <label for="exampleInputEmail1">Aluno</label>
      <input type="text" class="form-control" id="data_devolucao" placeholder="Digite o valor">
    </div>
  </div>
  <div class="form-group col-md-4">
    <label for="exampleInputEmail1">Senha</label>
    <input type="password" class="form-control" id="data_devolucao" placeholder="Digite o valor">
  </div>
</div>
<hr />

<div class="row">
  <div class="col-md-12">
    <button type="submit" class="btn btn-primary">Concluir</button>
    <a href="template.html" class="btn btn-default">Cancelar</a>
  </div>
</div>

</form>
</div>

<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>