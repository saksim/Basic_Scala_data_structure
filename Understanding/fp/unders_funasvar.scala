/*������Ϊ����*/
//��ʽ�ƶϺ����ķ���ֵ
val f = (i: Int) => { i % 2 == 0}

//�����������ӣ���Ҫ��ʽ���������������ķ�������
val f: (Int) => Boolean = i => { i % 2 ==0}
val f: Int => Boolean = i => { i % 2 ==0}

//�ڶ�����ʽ����������INT����
/*��ʽ
val add = (x:Int, y:Int) => { x + y }
val add = (x:Int, y:Int) => x + y
*/
/*��ʽ
val add:(Int,Int) => Int = (x,y) => {x+y}
val add:(Int,Int) => Int = (x,y) => x+y
*/

//����Ӧ�ú���
val c = scala.math.cos _
val c = scala.math.cos(_)
//����������Ҫ����һ��������������ʱδ����
//��������
val p = scala.math.pow(_,_)
