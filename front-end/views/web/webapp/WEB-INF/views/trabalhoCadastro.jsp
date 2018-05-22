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
  <form action="">
    <div class="row">
      <div class="form-group col-md-4">
        <label for="exampleInputEmail1">Tipo(TCC,DISSERTACAO,TESE)</label>
        <input type="text" class="form-control" id="nome" placeholder="Digite o valor">
      </div>
      <div class="form-group col-md-4">
        <label for="exampleInputEmail1">Autor</label>
        <input type="text" class="form-control" id="autor" placeholder="Digite o valor">
      </div>
      <div class="form-group col-md-4">
        <label for="exampleInputEmail1">Orientador</label>
        <input type="text" class="form-control" id="orientador" placeholder="Digite o valor">
      </div>
    </div>

    <div class="row">
      <div class="form-group col-md-3">
        <label for="exampleInputEmail1">Título</label>
        <input type="text" class="form-control" id="titulo" placeholder="Digite o valor">
      </div>
      <div class="form-group col-md-3">
        <label for="exampleInputEmail1">Local da Defesa</label>
        <input type="text" class="form-control" id="local_defesa" placeholder="Digite o valor">
      </div>

      <div class="form-group col-md-3">
        <label for="exampleInputEmail1">Data de publicacao</label>
        <input type="date" class="form-control" id="data" placeholder="Digite o valor">
      </div>

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