double size1 =100
double size2  =20
double size3 =50
double size4 =70
return [
new Dodecahedron(100).toCSG().movex(size1*0),
new Icosahedron(size2).toCSG().movex(size1+size2/2),
new Octahedron(size3).toCSG().movex(size1+size2+size3/2),
new Tetrahedron(size4).toCSG().movex(size1+size2+size3+size4/2)

]