renda = float(input("Digite sua renda: "))
procentagem = float(input("Digite quanto será a porcentagem que você pode pagar: "))
rendaPorc = (renda * procentagem)/100
prestacao = float(input("Digite s prestação do carro: "))

if (rendaPorc >= prestacao) :
    print("VOCÊ PODE COMPRAR O CARRO :)")

else:
    print("VOCẼ NÃO PODE COMPRAR O CARRO :( ")
