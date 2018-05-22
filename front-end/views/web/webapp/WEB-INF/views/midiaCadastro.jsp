<!DOCTYPE html>
<html lang="pt-br">
<head>
 <meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>CRUD com Bootstrap 3</title>

 <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/styleNovo.css" rel="stylesheet">
</head>
<body>
 <div id="main" class="container-fluid"> 
  <form action="index.html">
    <div class="row">
      <div class="form-group col-md-4">
        <label for="exampleInputEmail1">Tipo: (CD/DVD)</label>
        <input type="text" class="form-control" id="tipo" placeholder="Digite o valor">
      </div>
    <div class="form-group col-md-4">
        <label for="exampleInputEmail1">Titulo</label>
        <input type="text" class="form-control" id="nome_mae" placeholder="Digite o valor">
      </div>
     <div class="form-group col-md-3">
        <label for="exampleInputEmail1">Data Publicação</label>
        <input type="date" class="form-control" id="data" placeholder="Digite o valor">
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
 
 <script src="js/jquery.min.js"></script>
 <script src="js/bootstrap.min.js"></script>
</body>
</html>