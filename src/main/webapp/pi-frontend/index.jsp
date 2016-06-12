<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<title>Projeto Interdisciplinar - Home</title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Cardio is a free one page template made exclusively for Codrops by Luka Cvetinovic" />
	<meta name="keywords" content="html template, css, free, one page, gym, fitness, web design" />
	<meta name="author" content="Luka Cvetinovic for Codrops" />
	<meta name="generator" content="Bootply"/>
	<!-- Favicons (created with http://realfavicongenerator.net/)-->
	<link rel="apple-touch-icon" sizes="57x57" href="img/favicons/apple-touch-icon-57x57.png">
	<link rel="apple-touch-icon" sizes="60x60" href="img/favicons/apple-touch-icon-60x60.png">
	<link rel="icon" type="image/png" href="img/favicons/favicon-32x32.png" sizes="32x32">
	<link rel="icon" type="image/png" href="img/favicons/favicon-16x16.png" sizes="16x16">
	<link rel="manifest" href="img/favicons/manifest.json">
	<link rel="shortcut icon" href="img/favicons/favicon.ico">

	<meta name="msapplication-TileColor" content="#00a8ff">
	<meta name="msapplication-config" content="/img/favicons/browserconfig.xml">
	<meta name="theme-color" content="#ffffff">

	<!-- My Custom CSS -->
	<link href="css/style.css" rel="stylesheet">

	<script data-require="angular.js@*" data-semver="1.2.13" src="http://code.angularjs.org/1.2.13/angular.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    <script type="text/javascript" src="js/app.js"></script>
	<script src="js/jquery-1.10.2.js"></script>

	<!-- Normalize -->
	<link rel="stylesheet" type="text/css" href="css/normalize.css">
	<!-- Bootstrap -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<!-- Owl -->
	<link rel="stylesheet" type="text/css" href="css/owl.css">
	<!-- Animate.css -->
	<link rel="stylesheet" type="text/css" href="css/animate.css">
	<!-- Font Awesome -->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.1.0/css/font-awesome.min.css">
	<!-- Elegant Icons -->
	<link rel="stylesheet" type="text/css" href="fonts/eleganticons/et-icons.css">
	<!-- Main style -->
	<link rel="stylesheet" type="text/css" href="css/cardio.css">

	<!--[if lt IE 9]>
    <script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>

<body>
	<div class="preloader">
		<img src="img/loader.gif" alt="Preloader image">
	</div>

	<nav class="navbar">
	    <div class="container">
	        <!-- Brand and toggle get grouped for better mobile display -->
	        <div class="navbar-header">
	            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
	                <span class="sr-only">Toggle navigation</span>
	                <span class="icon-bar"></span>
	                <span class="icon-bar"></span>
	                <span class="icon-bar"></span>
	            </button>
	            <a class="navbar-brand" href="/pi-frontend/">
	            	<img src="img/logo.png" data-active-url="img/logo-active.png" alt="">
	            </a>
	        </div>
	        <!-- Collect the nav links, forms, and other content for toggling -->
	        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	            <ul class="nav navbar-nav navbar-right main-nav">
	                <li><a href="#intro">Início</a></li>
	                <li><a href="#services">Servicos</a></li>
	                <li><a href="/pi-frontend/monitoria.jsp">Monitoria</a></li>
	                <li class="item-menu item-menu-presenca"><a href="/pi-frontend/presenca.jsp">Presença</a></li>
	                <li><a href="#" data-toggle="modal" data-target="#modal1" class="btn btn-blue">Entrar</a></li>
	            </ul>
	        </div>
	        <!-- /.navbar-collapse -->
	    </div>
	    <!-- /.container-fluid -->
	</nav>

	<header id="intro">
		<div class="container">
			<div class="table">
				<div class="header-text">
					<div class="row">
						<div class="col-md-12 text-center">
							<h3 class="light white">Agilidade e praticidade.</h3>
							<h1 class="white typed">Um ferramenta feita para você.</h1>
							<span class="typed-cursor">|</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	
	<section>
		<div class="cut cut-top"></div>
		<div class="container">
			<div class="row intro-tables">
				<div class="col-md-6">
					<div class="intro-table intro-table-hover intro-table-first">
						<h5 class="white heading hide-hover">Componentes</h5>
						<div class="bottom">
							<h4 class="white heading small-heading no-margin regular">Monitoria</h4>
							<a href="/pi-frontend/monitoria.jsp" class="btn btn-white-fill expand">Acessar</a>
						</div>
					</div>
				</div>

				<div class="col-md-6">
					<div class="intro-table intro-table-hover intro-table-hover-second">
						<h5 class="white heading hide-hover">Mack Chamada</h5>
						<div class="bottom">
							<h4 class="white heading small-heading no-margin regular">Presença Online</h4>
							<a href="/pi-frontend/presenca.jsp" class="btn btn-white-fill expand">Acessar</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	
	<section id="services" class="section section-padded">
		<div class="container">
			<div class="row text-center title">
				<h2>Serviços</h2>
				<h4 class="light muted">Confira a lista dos serviços disponibilizados!</h4>
			</div>
			<div class="row services">
				<div class="col-md-6">
					<div class="service">
						<div class="icon-holder">
							<img src="img/icons/monitoria.png" alt="" class="icon">
						</div>
						<h4 class="heading">Monitoria</h4>
						<p class="description">A monitoria é entendida como instrumento para a melhoria do ensino de graduação.</p>
					</div>
				</div>
				<div class="col-md-6">
					<div class="service">
						<div class="icon-holder">
							<img src="img/icons/presenca.png" alt="" class="icon">
						</div>
						<h4 class="heading">Presença Online</h4>
						<p class="description">Presença Online é um conjunto de fatores e esforços da Universidade que ajudam a construir e fortalecer os seus serviços.</p>
					</div>
				</div>
			</div>
		</div>
		<div class="cut cut-bottom"></div>
	</section>
	
	<div class="modal fade" id="modal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content modal-popup">
				<a href="#" class="close-link"><i class="icon_close_alt2"></i></a>
				<h3 class="white">Entrar</h3>
				<form action="" class="popup-form">
					<input type="text" class="form-control form-white" placeholder="Usuário">
					<input type="text" class="form-control form-white" placeholder="Email">
					<div class="dropdown">
						<button id="dLabel" class="form-control form-white dropdown" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Tipo de Usuário
						</button>
						<ul class="dropdown-menu animated fadeIn" role="menu" aria-labelledby="dLabel">
							<li class="animated lightSpeedIn"><a href="#">Professor</a></li>
							<li class="animated lightSpeedIn"><a href="#">Aluno</a></li>
						</ul>
					</div>
					<div class="checkbox-holder text-left">
						<div class="checkbox">
							<input type="checkbox" value="None" id="squaredOne" name="check" />
							<!--<label for="squaredOne"><span>I Agree to the <strong>Terms &amp; Conditions</strong></span></label>-->
						</div>
					</div>
					<button type="submit" class="btn btn-submit">Entrar</button>
					<a class="" href="/pi-frontend/cadastrar-usuario.jsp">
						<button type="submit" class="btn btn-submit">Cadastrar</button>
					</a>
				</form>
			</div>
		</div>
	</div>

	<footer>
	    <div class="container">
	        <div class="row">
	            <div class="col-sm-6 text-center-mobile">
	                <h3 class="white">Easy Mack</h3>
	                <h5 class="light regular light-white">Sistema direcionado para os alunos e professores.</h5>
	                <a href="#" data-toggle="modal" data-target="#modal1" class="btn btn-blue ripple trial-button">Entrar</a>
	            </div>
	            <div class="col-sm-6 text-center-mobile">
	                <h3 class="white">Horários <span class="open-blink"></span></h3>
	                <div class="row opening-hours">
	                    <div class="col-sm-6 text-center-mobile">
	                        <h5 class="light-white light">Seg - Sex</h5>
	                        <h3 class="regular white">8:00 - 23:00</h3>
	                    </div>
	                    <div class="col-sm-6 text-center-mobile">
	                        <h5 class="light-white light">Sab</h5>
	                        <h3 class="regular white">8:00 - 14:00</h3>
	                    </div>
	                </div>
	            </div>
	        </div>
	        <div class="row bottom-footer text-center-mobile">
	            <div class="col-sm-8">
	                <p>&copy; 2015 Todos os direitos Reservados. Desenvolvido por alunos do Componente: Projeto Interdisciplinar(Prof. Dirceu). Universidade Presbiteria <a href="http://mackenzie.com.br">Mackenzie</a></p>
	            </div>
	            <div class="col-sm-4 text-right text-center-mobile">
	                <ul class="social-footer">
	                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
	                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
	                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
	                </ul>
	            </div>
	        </div>
	    </div>
	</footer>

	<!-- Holder for mobile navigation -->
	<div class="mobile-nav">
		<ul>
		</ul>
		<a href="#" class="close-link"><i class="arrow_up"></i></a>
	</div>

	<!-- Scripts -->
	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/wow.min.js"></script>
	<script src="js/typewriter.js" charset="utf-8"></script>
	<script src="js/jquery.onepagenav.js"></script>
	<script src="js/main.js"></script>
	<script src="js/scripts.js"></script>
	<script src="js/jquery-2.0.0.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>
