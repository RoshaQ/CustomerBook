<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Hello</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>${greeting}</h1>
				<p>${info}</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
				<div class="thumbnail">
					<div class="caption">
						<h3>Klienci</h3>
						<p>
							<a href="/websote/customers" class="btn btn-default"> <span
								class="glyphicon-info-sign glyphicon" /></span> Wyświetl wszystkich klientów
							</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
				<div class="thumbnail">
					<div class="caption">
						<h3>Dodaj klienta</h3>
						<p>
							<a href="/webstore/customers/add" class="btn btn-default"> <span
								class="glyphicon-info-sign glyphicon" /></span> Dodaj klienta
							</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="container">
        <div class="row">
            <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                <div class="thumbnail">
                    <div class="caption">
                        <h3>Szukaj klienta</h3>
                        <p>
                            <a href="/webstore/customers/search" class="btn btn-default"> <span
                                class="glyphicon-info-sign glyphicon" /></span> Szukaj klienta
                            </a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </section>
</body>
</html>
